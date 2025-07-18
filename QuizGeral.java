import java.util.Scanner;
public class Quiz{
    public static void Print(String format, Object... arguments){
        System.out.printf(format, arguments);
    }
    public static boolean Question(String quest, int number){
        //cores ANSI
        String green, red, reset;
        red = "\033[1;91m";
        green = "\033[1;92m";
        reset = "\033[00m";

        Scanner stdin = new Scanner(System.in); //input
        System.out.printf(quest);
        int response = stdin.nextInt();
        if (response == number){
            System.out.printf(green+"\nVocê acertou ! \n"+reset);
            return true;
        }else{
            System.out.printf(red+"\nVocê errou ! \n"+reset);
            return false;
        }

    }
    public static void main(String[] args){
        String yellow,reset;
        yellow = "\033[1;93m";
        reset = "\033[00m";
        //perguntas 
        String q1,q2,q3,q4,q5;
        q1 = "\nQual a capital do " + yellow + "Brasil" + reset + "?\nAlternativas:\n1)Brasília\n2)Caracas\n3)Washigton\n4)Toronto\n5)Cidade do Cabo\nEscolha : ";

        q2 = "\nQual a capital dos " + yellow + "Estados Unidos da América" + reset + "?\nAlternativas:\n1)Brasília\n2)Caracas\n3)Washigton\n4)Toronto\n5)Cidade do Cabo\nEscolha : ";

        q3 = "\nQuais climas dominam a região " + yellow + "sul do Brasil" + reset + "?\nAlternativas:\n1)Arido\n2)Subtropical\n3)Tropical\n4)Mediterrâneo\n5)Semiárido\nEscolha : ";

        q4 = "\nQual país faz fronteira com o " + yellow + "Brasil ao sul" + reset + "?\nAlternativas:\n1)Chile\n2)Uruguai\n3)Peru\n4)Colômbia\n5)México\nEscolha: ";

        q5 = "\nQual desses países é uma " + yellow + "ilha" + reset + "?\nAlternativas:\n1)Argentina\n2)Canadá\n3)Madagascar\n4)Espanha\n5)México\nEscolha: ";


       String questions[] = {q1,q2,q3,q4,q5};
       int responses[] = {1,3,2,2,3};
       int accerts = 0; //variavel para conta o número de acertos
       int index = 0;
       while(true){
           //indice da array é igual a 5? se sim zera para o loop ficar infinito;
           if(index == 5){
            index = 0;
           }
           //se a questão retornar true, o accerts é somado !
           if(Question(questions[index], responses[index])){
            accerts++;
            Print("Acertos : %d", accerts);
           }else{
            Question(questions[index], responses[index]);
           }
           //se o número de acertos for igual a 5, o loop é paradao
           if (accerts == 5){
            break;
           }
           index++;
           
       }
    }
}
