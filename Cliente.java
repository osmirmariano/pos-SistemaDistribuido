import java.net.UnknownHostException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;
import java.net.Socket;

public class Cliente {
    public static void main(String[] args) throws UnknownHostException, IOException {
        Socket cliente = new Socket("127.0.0.1", 12345);
        System.out.println("O cliente se conectou ao servidor!");

        diretorio = '/distribuido.txt';
        System.out.println(diretorio);

        output = new ObjectOutputStream(socket.getOutputStream());
        File file = new File(diretorio);
        FileInputStream arquivo = new FileInputStream(file);
        int tamanho = (int)file.length();
        output.writeInt(tamanho);
        output.writeUTF(file.getName());
        byte[] buffer = new byte[tamanho];
        
        while(true){
            int len = arquivo.read(buffer);
            if(len == -1) break;
            output.write(buffer, 0, len);
            System.out.println(tamanho);
            System.out.println("Arquivo enviado");
        }

        saida.close();
        teclado.close();
    }
}
