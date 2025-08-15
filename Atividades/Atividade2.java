public class Atividade {
    public static void preco(double precoOriginal){
        int porcentual_desconto = 10;
        double precoAserPago = precoOriginal - ((porcentual_desconto * precoOriginal) / 100);

        System.out.printf("6) O produto X custa  \033[1;93m %.2f reais \033[00m . Considerando que o cliente leva 10 por cento de desconto. Então preço a ser pago final é %.2f \n",precoOriginal,precoAserPago );
    }
    public static void ConverterDolares(double reais){
           double valor_dolar = 4.94;
           double convert_reais = valor_dolar * reais;
           System.out.printf("5) Valor \033[1;93m %.2f dolares  \033[00m  convertido para REAIS :  \033[1;92m %.2f \033[00m \n",reais, convert_reais);
    }
    public static void produtos(String nomedoProduto,double precoProduto,int quantidade){
        System.out.printf("4) Informação do produto : %s\n", nomedoProduto);
        double precoFinal =  precoProduto  * quantidade;
        System.out.printf("4) Cliente vai levar  %d items onde cada um custa  %f . Então o preço final será R$ %.2f\n", quantidade, precoProduto, precoFinal);

    }
    public static void mediaDecimal(double numero1,double numero2){
        double media;
        media = (numero1+numero2)/2;
        System.out.printf("1) Média calculada de  (\033[1;93m %f \033[00m + \033[1;93m %f \033[00m) / 2 =  \033[1;92m %.2f \033[00m \n", numero1, numero2,media);
    }
    public static void result(double numero){
        int num = (int) numero;
        System.out.printf("2) Número convertido para INT : %d\n", num);
    }
    public static void main(String[] args){
    mediaDecimal(2.3, 4.5);
    result(5.6);

    char letra;
    String palavra;
    letra = 'A';
    palavra = "B"+letra+"N"+letra+"N"+letra;
    System.out.printf("3) Palavra formada : \033[1;92m %s \033[00m\n",palavra);
    produtos("Nescau", 5.6, 3);
    ConverterDolares(8.0);
    preco(59.4);

    
    }
}
