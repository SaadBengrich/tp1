//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String ch="dbb";
        TokenManager tm=new TokenManager(ch);
        ParseurG2 parseur=new ParseurG2(tm);
        try{
            parseur.parse();
            System.out.println(ch +" est valide");

        }catch (RuntimeException exp){
            System.out.println(ch +" est nest pas valide");
            System.out.println(exp.getMessage());

        }

    }
}