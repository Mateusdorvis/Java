import java.net.*;
import java.io.*;
import java.nio.file.*;
import java.time.*; //importando time para mostrar a hora real do sistema

class Server{
    private int port;
    //construtor
    public Server(int port){
        this.port = port;
    }
    //métodos da classe
    public LocalDateTime dateNow(){
        LocalDateTime date = LocalDateTime.now();
        return date;
    }
    public void run(){
       try{ 
            String content = Files.readString(Path.of("site.html")); //pega o conteudo
            String logo = Files.readString(Path.of("art2.txt"));
            Print("\033[1;92m %s \033[00m\n", logo);
            Print("==================================================================================================================================================\n");
            ServerSocket socketserver = new ServerSocket(this.port);
            var address_server = socketserver.getInetAddress();
            Print(dateNow()+"  \033[1;37m  [+] Servidor "+address_server+" rodando  na porta "+port+"...\033[00m\n");
            Socket client_server = socketserver.accept();
            var client_addr = client_server.getInetAddress();
            Print(dateNow()+"   \033[1;37m [+] Escutando cliente : "+ client_addr+" \033[00m\n");
            String data = recv(client_server);
            Print(dateNow()+"    [*] Recebido : \033[1;33m \n%s\n\033[00m",data);
            String msg = "HTTP/1.1 200 OK\r\nContent-Type:text/html\r\nContent-Length: "+content.getBytes().length+"\r\nConnection:close\r\n\r\n"+content;
            sendto(client_server, msg);
            client_server.close();
            socketserver.close();
       }catch(IOException e){
           Print(dateNow()+"   Error : "+e.getMessage()+"\n");
       }



    }
    public String recv(Socket client) {
    try {
        InputStream input = client.getInputStream();
        byte[] buffer = new byte[4096];
        int recv_data = input.read(buffer);
        return new String(buffer, 0, recv_data);
    } catch (IOException e) {
        Print(dateNow()+"  Erro ao receber dados: %s\n", e.getMessage());
        return "";
    }
}

public void sendto(Socket client, String data) {
    try {
        OutputStream output = client.getOutputStream();
        var data_byte = data.getBytes();
        output.write(data_byte);
        output.flush();
    } catch (IOException e) {
        Print(dateNow()+"  Erro ao enviar dados: %s\n", e.getMessage());
    }
}

    public void Print(String format, Object...arguments){
        System.out.printf(format, arguments);
    }
    

}
public class Main{

       public static void  main(String[] args){
        if(args.length < 1){
             System.out.println("Usage : java Main PORT\nExample : java Main 8001\n");
             System.exit(1);
        }
        int port = Integer.parseInt(args[0]); //pega o primeiro argumento
        Server servidor = new Server(port);
        servidor.run(); //roda o servidor !
       }
}
