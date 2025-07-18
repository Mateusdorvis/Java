import java.utils.*;
public class Quiz{
    public static void alternatives(String format, Object... arguments){
        System.out.printf(format);
    }
    public static void questions(){
        String q1,q2,q3,q4,q5;
        /*PERGUNTAS */ 
        q1 = "Qual é a capital dos Estados Unidos ?";
        alternatives("""
ALTERNATIVAS:
1) Washington D.C
2) Brasília
3) Montevideu
4) Pequim
5) Seul
        """);


    }
    public static void main(String[] args){

    }
}