import java.util.Scanner; //importando Scanner que é como fgets() do C/C++

public class Filme2 {
    public static void Print(String format, Object... arguments){
                System.out.printf(format, arguments);
    }
    public static class Filmografia{
        public static  String nome_filme, descricao, verde_light, vermelho, verde, amarelo, azul, reset, cor_status, status, recomendacao, cor_recomendacao, cor;
        public static int ano_lancamento, idade_filme, ano_atual;
        public static boolean incluir_plano;
        public static double media, n1,n2,n3;
        //CONSTRUCTOR
        public static void __constructor(String NomeDoFIlme, String Descricao, int AnoDeLancamento, boolean IncluirPlano, double Nota1, double Nota2, double Nota3){
            nome_filme = NomeDoFIlme;
            descricao = Descricao;
            ano_lancamento = AnoDeLancamento;
            incluir_plano = IncluirPlano;
            n1 = Nota1;
            n2 = Nota2;
            n3 = Nota3;
        }
        //métodos da classe 
        
        public static void info(){
        if (incluir_plano){
            cor = azul;
        }else{
            cor = vermelho;
        }
        //cores ANSI
        verde_light = "\033[1;32m";
        vermelho = "\033[1;91m";
        verde = "\033[1;92m";
        amarelo = "\033[1;93m";
        azul = "\033[1;94m";
        reset = "\033[00m";
        
        //calculando a média;
        media  = (n1+n2+n3) / 3;
        //ano atual
        ano_atual = 2025;
        //verificando a idade do filme
        idade_filme = ano_atual - ano_lancamento;
        //condição da idade
        if(idade_filme >= 0 && idade_filme <= 5){
            cor_recomendacao = verde_light;
            if (idade_filme <= 1){
               recomendacao = cor_recomendacao+" Filme 'recente', pois já faz "+idade_filme+" ano !"+reset;
            }else{
                recomendacao = cor_recomendacao+" Filme 'recente', pois já faz "+idade_filme+" anos !"+reset;
            }
        }else if(idade_filme >= 6 && idade_filme <= 20){
           cor_recomendacao = amarelo;
           recomendacao = cor_recomendacao+" Filme 'cult', pois já faz "+idade_filme+" anos !"+reset;
        }else{
           cor_recomendacao = vermelho;
           recomendacao = cor_recomendacao+" Filme 'clássico', pois já faz "+idade_filme+" anos !"+reset;
        }
        //chamando a função print
        Print("INFORMAÇÕES SOBRE O FILME : %s %s %s\n", amarelo, nome_filme, reset);
        Print("Nome do filme : %s %s %s\n", amarelo, nome_filme, reset);
        Print("Ano de lançamento  do filme : %s %d %s\n", amarelo, ano_lancamento, reset);
        Print("Nivel de recomendação dos clientes  : %s  \n", recomendacao);
        //condição do média e estilização
        if(media >= 7){
            cor_status = verde;
            System.out.printf("%s  Filme com avaliação ÓTIMA!, pois sua média é %.2f % ",cor_status, media, reset); 
        }else if(media >= 5 && media  <= 6.99){
            cor_status = amarelo;
           System.out.printf("%s  Filme com avaliação MEDIANA!, pois sua média é %.2f % ",cor_status, media, reset); 
        }else{
            cor_status = vermelho;
           System.out.printf("%s  Filme com avaliação PÉSSIMA !, pois sua média é %.2f % ",cor_status, media, reset); 
        }
        Print("Nota média do filme : %s %.2f %s \n", cor_status, media, reset);
        Print("Sinopse do filme  : %s %s %s \n", cor_status, descricao, reset);
        Print("Incluido no plano : %s %b %s",cor, incluir_plano, reset);
        }
    }
    public static void main(String[] args){
        String LOGO_JAVA, LOGO, nome_filme, descricao, result;
        double nota1,nota2,nota3;
        int ano_lancamento;
        boolean plan;


        LOGO_JAVA = """
                                         
       ,---._                                    
       .-- -.' \\                                   
       |    |   :                                  
       :    ;   |                                  
       :        |               .---.              
       |    :   :  ,--.--.    /.  ./|   ,--.--.    
       :          /       \\ .-' . ' |  /       \\   
       |    ;   |.--.  .-. /___/ \\: | .--.  .-. |  
   ___ l          \\__\\/ : . .   \\  ' .  \\__\\/ : . .  
 /    /\\    J   : ," .--.; |\\   \\   '  ," .--.; |  
/  ../  `..-    ,/  /  ,.  | \\   \\    /  /  ,.  |  
\\    \\         ;;  :   .'   \\ \\   \\ |;  :   .'   \\ 
 \\    \\      ,' |  ,     .-./  '---" |  ,     .-./ 
  "---....--'    `--`---'             `--`---'     
                                                  
                """;
       
        LOGO = """
                
                
                
                ___________.__.__                ___________                       .__  __          
\\_   _____/|__|  |   _____   ____\\_   _____/____ ___  _____________|__|/  |_  ____  
 |    __)  |  |  |  /     \\_/ __ \\|    __) \\__  \\\\  \\/ /  _ \\_  __ \\  \\   __\\/  _ \\ 
 |     \\   |  |  |_|  Y Y  \\  ___/|     \\   / __ \\\\   (  <_> )  | \\/  ||  | (  <_> )
 \\___  /   |__|____/__|_|  /\\___  >___  /  (____  /\\_/ \\____/|__|  |__||__|  \\____/ 
     \\/                  \\/     \\/    \\/        \\/                                  
                
                """;
        Print("\033[1;91m %s \033[00m\n",LOGO_JAVA);
        Print("APRESENTS \n");
        Print("\033[1;92m %s \033[00m\n",LOGO);

        Scanner stdin = new Scanner(System.in);
        Print("Nome do filme que é seu favorito : ");
        //pula para proxima linha
        nome_filme = stdin.nextLine();
        Print("Sinopse  do filme \033[1;92m %s \033[00m :  ", nome_filme);
        descricao  = stdin.nextLine();
        Print("Ano de lançamento do filme \033[1;92m %s \033[00m :  ", nome_filme);
        ano_lancamento = stdin.nextInt();

        
        plan = true;
        Print("Nota 1  do filme \033[1;92m %s \033[00m :  ", nome_filme);
        nota1  = stdin.nextDouble();
        Print("Nota 2  do filme \033[1;92m %s \033[00m :  ", nome_filme);
        nota2  = stdin.nextDouble();
        Print("Nota 3  do filme \033[1;92m %s \033[00m :  ", nome_filme);
        nota3  = stdin.nextDouble();
        //Print("Incluir   o filme \033[1;92m %s \033[00m  no seu plano ?  ", nome_filme);
       // plan  = stdin.nextBoolean();
        //criando um novo objeto
        Filmografia filme_novo =  new Filmografia();
        filme_novo.__constructor(nome_filme,descricao, ano_lancamento, plan, nota1, nota2,nota3);
        filme_novo.info();//mostra as informações




        
    }
}
