import java.util.Scanner;
public class Teste{
    //função para imprimir uma mensagem
    public static void Print(String format, Object... arguments){
         System.out.printf(format,arguments);
         
    }

    public static void ExibirDados(String nome, int idade,String rua, String bairro,String CEP, String cidade, String estado, String pais) {
        String green,red,reset,yellow,blue;
        //code ANSI
        red = "\033[1;91m";
        green = "\033[1;92m";
        yellow = "\033[1;93m";
        blue = "\033[1;94m";
        reset = "\033[00m";
        //chamando a FUNÇÃO 
        Print("Seu nome :%s %s %s\n",yellow,nome,reset);
        Print("Idade :%s %d %s\n",yellow,idade,reset);
        Print("RUA :%s %s %s\n",yellow,rua,reset);
        Print("BAIRRO :%s %s %s\n",yellow,bairro,reset);
        Print("CIDADE :%s %s %s\n",yellow,cidade,reset);
        Print("ESTADO :%s %s %s\n",yellow,estado,reset);
        Print("PAÍS :%s %s %s\n",yellow,pais,reset);
        Print("CEP :%s %s %s\n",yellow,CEP,reset);
    }
    public static void main(String[] args){
        ExibirDados("Mateus", 19, "2031", "Mário Quintana", "91250-695", "Porto Alegre", "Rio Grande do Sul", "Brasil");
        
    }
}