import java.net.ServerSocket;
import java.io.IOException;
import java.util.Scanner;
import java.net.Socket;

public class Servidor {
  public static void main(String[] args) throws IOException {
    ServerSocket servidor = new ServerSocket(12345);
    System.out.println("Porta 12345 aberta!");

    Socket cliente = servidor.accept();
    System.out.println("Nova conexao com o cliente " + cliente.getInetAddress().getHostAddress());

    int tamanho = input.readInt();
    String nomeArq = input.readUTF();
    FileOutputStream file = new FileOutputStream("C:/Users/osmir/Documents/GitHub/POS/pos-SistemaDistribuido/"+nomeArq);
    byte[] buffer = new byte[tamanho];
    while(true){
      int len = input.read(buffer);
      if(len == -1) break;
      file.write(buffer, 0, len);
    }
    System.out.println("Arquvio Recebido");

    entrada.close();
    servidor.close();
  }
}