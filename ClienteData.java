import java.net.*;
import java.io.*;
import java.util.*;

public class ClienteData {
       public static void main(String args[]) throws Exception
       {  
           InetAddress endereco = InetAddress.getLocalHost();
           //pegar endereco ip do cliente

           Socket s = new Socket(endereco,9000);
           
           Scanner entrada = new Scanner(s.getInputStream());
           //ler da rede

           String m = entrada.nextLine();
           System.out.println("Data: "+m);
           entrada.close();
           s.close();
       }
}
