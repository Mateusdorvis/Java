import java.util.Scanner;
public class QuizGeral{
    public static String Parabens(){
        String logo = 
                "          ____                                                                                        \n" +
                "        ,'  , `.                         ___                                                   ____   \n" +
                "     ,-+-,.' _ |                ,--,   ,--.'|_                     ,---,                     ,'  , `. \n" +
                "  ,-+-. ;   , ||         ,--, ,--.'|   |  | :,'   ,---.          ,---.'|      ,---.       ,-+-,.' _ | \n" +
                " ,--.'|'   |  ;|       ,'_ /| |  |,    :  : ' :  '   ,'\\         |   | :     '   ,'\\   ,-+-. ;   , || \n" +
                "|   |  ,', |  ':  .--. |  | : `--'_  .;__,'  /  /   /   |        :   : :    /   /   | ,--.'|'   |  || \n" +
                "|   | /  | |  ||,'_ /| :  . | ,' ,'| |  |   |  .   ; ,. :        :     |,-..   ; ,. :|   |  ,', |  |, \n" +
                "'   | :  | :  |,|  ' | |  . . '  | | :__,'| :  '   | |: :        |   : '  |'   | |: :|   | /  | |--'  \n" +
                ";   . |  ; |--' |  | ' |  | | |  | :   '  : |__'   | .; :        |   |  / :'   | .; :|   : |  | ,     \n" +
                "|   : |  | ,    :  | : ;  ; | '  : |__ |  | '.'|   :    |        '   : |: ||   :    ||   : |  |/      \n" +
                "|   : '  |/     '  :  `--'   \\|  | '.'|;  :    ;\\   \\  /         |   | '/ : \\   \\  / |   | |`-'       \n" +
                ";   | |`-'      :  ,      .-./;  :    ;|  ,   /  `----'          |   :    |  `----'  |   ;/           \n" +
                "|   ;/           `--`----'    |  ,   /  ---`-'                   /    \\  /           '---'            \n" +
                "'---'                          ---`-'                            `-'----'                             \n";
        return logo;
    }
    public static void Print(String format, Object... arguments){
        System.out.printf(format, arguments);
    }
    public static boolean Question(String quest, int number){
        //cores ANSI
        String green, red, reset, yellow, BLUE;
        red = "\033[1;91m";
        green = "\033[1;92m";
        yellow = "\033[1;93m";
        yellow = "\033[1;94m";
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
        String yellow,reset, green, red, blue;
        red = "\033[1;91m";
        blue = "\033[1;94m";
        yellow = "\033[1;93m";
        green = "\033[1;92m";
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
       int acertos = 0;
       int accerts = 0; //variavel para conta o número de acertos
       int index = 0;
       while(index < questions.length){
           //indice da array é igual a 5? se sim zera para o loop ficar infinito;
           /*if(index == 5){
            index = 0;
           }*/
           //se a questão retornar true, o accerts é somado !
           if(Question(questions[index], responses[index])){
            accerts++;
            Print("Acertos : %d\n", accerts);
           }/*else{
            Question(questions[index], responses[index]);
           }*/
           //se o número de acertos for igual a 5, o loop é paradao
           if (accerts == 5){
            Print("%s %s %s", green, Parabens(), reset);
            break;
           }
			   acertos = accerts;
		   
           
           index++;
           
       }
       if(acertos >= 2 && acertos < 4){
		    Print("\033[1;32m 0101011001101111011000111110101000100000011101000110010101101101001000000111010101101101001000000110001101101111011011100110100001100101011000110110100101101101011001010110111001110100011011110010000001101101011001010110010001101001011000010110111001101111001000000110010101101101001000000110011101100101011011110110011101110010011000010110011001101001011000010010000001100111011001010111001001100001011011000010000000100001001000000100110101100001011100110010000001101110111000110110111100100000011100110110010100100000011100000111001001100101011000110110111101110101011100000110010100100000011101100110111101100011111010100010000001100110011011110110100100100000011000100110010101101101001011000010000001110011111100110010000001110000011100100110010101100011011010010111001101100001001000000110110101100101011011000110100001101111011100100110000101110010001000000110111001101111001000000111000101110101011010010111101000100000011001000110000100100000011100000111001011110011011110000110100101101101011000010010000001110110011001010111101000100000001000010010000001001111011000100111001001101001011001110110000101100100011011110010000000100001 \033[00m\n");
            Print("Acertos : %d\nSTATUS :%s MEDIANO %s\n", accerts,yellow , reset);
       }else if(acertos == 4){
		   Print("Acertos : %d\nSTATUS :%s BOM EM GEOGRAFIA %s\n", accerts,green , reset);
	   }
       else if(acertos >= 0 && acertos < 2){
		   Print("Acertos : %d\nSTATUS :%s RUIM %s\n", accerts,red , reset);
	   }
        
    }
}
