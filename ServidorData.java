import java.util.*;

public class ServidorData {
       public static void main(String args[]) throws Exception
       {  
          ServerSocket servidor = new ServerSocket(9000);
          System.out.println("Servidor Aguardando");
          Socket s;
          PrintWriter saida;
          while(true){

                System.out.println("Servidor aguardando...");
                s = servidor.accept();

                System.out.println(s);

                saida = new PrintWriter(s.getOutputStream(),true);
                 //criou fluxo de saida
             
                Date d = new Date();
                saida.println(d.toString());
                saida.close();
                s.close();
          } 
      }
}