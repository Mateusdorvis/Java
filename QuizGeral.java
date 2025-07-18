import java.util.Scanner;
public class QuizGeral{
    
    public static void Question(String format, int number){
        int contagem = 0;
        String red,green,reset;
        red = "\033[1;91m";
        green = "\033[1;92m";
        reset = "\033[00m";
        Scanner stdin =  new Scanner(System.in); //input com scanner que eu chamo de stdin (Standart Input)
        System.out.printf(format);
        int response = stdin.nextInt();
        if(response == number){
              System.out.printf(green+"\nVocê acertou\n"+reset);
              contagem++;
              System.out.println(contagem);
        }else{
            System.out.printf(red+"\nErrou\n"+reset);
        }
        
    }
    public static void Print(String format, Object... arguments){
        System.out.printf(format);

    }
    public static void Perguntas(){
    String q1,q2,q3,q4,q5;
    int contagem;
    contagem = 0;
    /*PERGUNTAS */
    q1 = "\nQual é a capital dos Estados Unidos ?\n ALTERNATIVAS:\n1) Washington D.C\n2) Brasília\n3) Montevideu\n4) Pequim\n5) Seul\nEscolha : ";
    q2 = "\nQuais clima é predominante na região sul do Brasil ?\nALTERNATIVAS:\n1) Atlântico\n2) Tropical\n3) Subtropical\n4) Mediterâneo\n5) Arido\nEscolha : ";
    while (contagem != 5){
        Question(q1, 1);
        Question(q2, 3);
    }
    }
    public static void main(String[] args){

        Perguntas();
    }
}
