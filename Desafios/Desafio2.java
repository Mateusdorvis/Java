
import java.util.Scanner;
public class Desafio2{
    public static void Print(String format, Object... arguments){
        System.out.printf(format, arguments);
    }
    public static int numero(int number, int number2){
        if(number > number2){
           Print("%d é maior do que %d\n", number, number2);
        }else if(number2 > number){
          Print("%d é maior do que %d\n", number2, number);
        }
        if( number == number2){
             Print("%d é igual a %d\n", number, number2);
        }else{
             Print("%d é diferente do que %d\n", number, number2);
        }
        return 0;
    }
    public static void main(String[] args){
        Scanner stdin = new Scanner(System.in);
        Print("Digite um número : ");
        int n1 = stdin.nextInt();
        Print("Digite outro : ");
        int n2 = stdin.nextInt();
        numero(n1, n2); //chamando a função
    }

}