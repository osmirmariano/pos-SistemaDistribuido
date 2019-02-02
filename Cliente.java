import java.net.UnknownHostException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;
import java.net.Socket;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class Cliente {
    public static void main(String[] args) throws UnknownHostException, IOException {
        File f = new File("/home/osmir/Documents/GitHub/pos/pos_SistemaDistribuido/distribuido.txt");
        FileInputStream in = new FileInputStream(f);

        System.out.println("O cliente se conectou ao servidor! \n Diretorio do arquivo: " + f);
        
        Socket socket = new Socket("127.0.0.1", 1234);
        OutputStream out = socket.getOutputStream();
        OutputStreamWriter osw = new OutputStreamWriter(out);
        BufferedWriter writer = new BufferedWriter(osw);
        
        writer.write(f.getName() + "\n");
        writer.flush();
        int tamanho = 4096; // buffer de 4KB  
        byte[] buffer = new byte[tamanho];  
        int lidos = -1;  
        while ((lidos = in.read(buffer, 0, tamanho)) != -1) {  
            out.write(buffer, 0, lidos);  
        }   
    }
}