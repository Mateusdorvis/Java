public class Filme {

    public static void main(String[] args){
        String nomeDoFilme,logo,sinopse, status;
        int anoDeLancamento;
        boolean incluidoNoPlano;
        double nomeDoFilmeIMDb, nomeDoFilmeRotten,nomeDoFilmeMetacritic, media;
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
        nomeDoFilmeIMDb = 1.0;
        nomeDoFilmeRotten = 8.9;
        nomeDoFilmeMetacritic = 8.4;

        media = ( nomeDoFilmeIMDb + nomeDoFilmeRotten + nomeDoFilmeMetacritic ) / 3;
        if( media >= 7){
            status = "Status : \033[1;92m ÓTIMO \033[00m\n";
        }else if(media >= 5 && media <= 6.99){
             status = "Status : \033[1;93m MEDIANO \033[00m\n";
        }
        else{
            status = "Status : \033[1;91m RUIM \033[00m\n";
        }
        System.out.printf("\033[1;92m %s \033[00m\n",logo);
        System.out.printf("Nome do Filme : \033[1;92m %s \033[00m\n",nomeDoFilme);
        System.out.printf("Ano do lançamento : \033[92m %d \033[00m\n",anoDeLancamento);
        System.out.printf("Sinopse : \033[92m %s \033[00m\n",sinopse);
        System.out.printf("Média das notas : \033[92m %f \033[00m\n",media);
        System.out.printf("%s\n",status);
        System.out.printf("Incluir no Plano : \033[1;94m %b \033[00m\n",incluidoNoPlano);
        

    }
}