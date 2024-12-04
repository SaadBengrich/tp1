public class ParseurG2 {
    private TokenManager tm;
    private char tc;

    public ParseurG2(TokenManager tm) {
        this.tm = tm;
        avancer();
    }
    public void consommer(char att){
        if(tc==att){
            avancer();
        }
        else {
            throw new RuntimeException("expected "+att );
        }
    }

    private void avancer(){
        tc=tm.suivant();
    }
    private void S(){
        if(tc=='d'){
            consommer('d');
            B();C();
        }
        else {
            throw new RuntimeException("token expected is d");
        }
    }
    private void B(){
        if(tc=='d'){
            consommer('d');
            C();
        } else if (tc=='b') {
            consommer('b');
        }
        else throw new RuntimeException(tc+"non attendu");

    }
    private void C(){
        if(tc=='b'){
            consommer('b');
            B();
        } else if (tc=='c') {
            consommer('c');
        }
        else throw new RuntimeException(tc+"non attendu");    }
    public void parse(){
        S();
        if(tc!='#')
            throw new RuntimeException(tc+"non valide");
    }
}
