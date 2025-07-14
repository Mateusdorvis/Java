public class Filme {
    public static void infoMovie(String movie,boolean plan, String description, int year, double n1, double n2, double n3){
        String verde,vermelho,amarelo,azul,verde_light,reset, status, cor, color_plan,info;
        
        double media;
        media = (n1+n2+n3) / 3;
        int ano_atual = 2025;
        //cores ANSI
        verde_light = "\033[1;32m";
        vermelho = "\033[1;91m";
        verde = "\033[1;92m";
        amarelo = "\033[1;93m";
        azul = "\033[1;94m";
        reset = "\033[00m";
        if( media >= 7){
            //cor no começo é null, mas recebe o valor de outra variável tipo String 
            cor = verde;
            status = verde+"ÓTIMO"+reset;
        }else if(media >= 5 && media <= 6.99){
             cor = amarelo;
             status = amarelo+"MEDIANO"+reset;
        }
        else{
            cor = vermelho;
            status = vermelho+"RUIM"+reset;
        }
        if (plan){
            color_plan = azul;
        }
        else{
            color_plan = vermelho;
        }
        int idade_movie = ano_atual - year;
        if (idade_movie >= 5 && idade_movie <= 20){
            info = amarelo+" Um clássico ! Filme recomendado !"+reset;
        }else if(idade_movie >= 0 && idade_movie <= 5){
            if(idade_movie <= 1){
                info = verde+" Filme 'recente' lançado há "+idade_movie+"  ano atrás  ! Filme recomendado !"+reset;
            }else{
                info = verde+" Filme 'recente' lançado há "+idade_movie+" anos atrás  ! Filme recomendado !"+reset;
            }
        }else{
            info = vermelho+" Um filme retro ! Filme recomendado !"+reset;
        }
        
        //PRINT
        System.out.printf("Informações sobre o Filme : %s %s %s\n",amarelo,movie,reset);
        System.out.printf("Nome do  filme : %s %s %s\n",verde,movie,reset);
        System.out.printf("Ano de lançamento : %s %d %s\n",verde,year,reset);
        System.out.printf("Sinopse do filme : %s %s %s\n",verde,description,reset);
        System.out.printf("Incluir no plano : %s %b %s\n",color_plan,plan,reset);
        System.out.printf("Média do filme : %s %.1f %s\n",cor,media,reset);
        System.out.printf("STATUS : %s \n",status);
        System.out.printf("Recomendação : %s\n", info);
        System.out.printf("--------------------------------------------------- \n");
        
        
    }
    public static void main(String[] args){
        String nomeDoFilme,logo,sinopse,logo_JAVA;
        logo_JAVA = """
                                         
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
        int anoDeLancamento;
        boolean incluidoNoPlano;
        double nomeDoFilmeIMDb, nomeDoFilmeRotten,nomeDoFilmeMetacritic;
        logo = """
                
                
                
                ___________.__.__                ___________                       .__  __          
\\_   _____/|__|  |   _____   ____\\_   _____/____ ___  _____________|__|/  |_  ____  
 |    __)  |  |  |  /     \\_/ __ \\|    __) \\__  \\\\  \\/ /  _ \\_  __ \\  \\   __\\/  _ \\ 
 |     \\   |  |  |_|  Y Y  \\  ___/|     \\   / __ \\\\   (  <_> )  | \\/  ||  | (  <_> )
 \\___  /   |__|____/__|_|  /\\___  >___  /  (____  /\\_/ \\____/|__|  |__||__|  \\____/ 
     \\/                  \\/     \\/    \\/        \\/                                  
                
                """;
        nomeDoFilme = "Blade Runner 2049";
        sinopse = "O filme é uma continuação direta de Blade Runner da década de 1980";
        anoDeLancamento = 2017;
        incluidoNoPlano = true;
        nomeDoFilmeIMDb = 5.0;
        nomeDoFilmeRotten = 5.9;
        nomeDoFilmeMetacritic = 7.4;
        System.out.printf("\033[1;91m %s \033[00m\n",logo_JAVA);
        System.out.printf("APRESENTS \n");
        System.out.printf("\033[1;92m %s \033[00m\n",logo);
        //chamando a função
        infoMovie(nomeDoFilme, incluidoNoPlano, sinopse, anoDeLancamento, nomeDoFilmeIMDb, nomeDoFilmeMetacritic, nomeDoFilmeRotten);

        infoMovie("Scream", false, "Scream ou Pânico em português. É um filme de terror slasher que satiriza o gênero do terror.", 1996, 7.8, 6.6, 7.4);

        infoMovie("Scream6", false, "Scream ou Pânico em português. É um filme de terror slasher que satiriza o gênero do terror.", 2023, 7.8, 6.6, 7.4);
    }
}