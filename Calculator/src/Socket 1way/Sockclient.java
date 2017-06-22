package Socket;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.*;
import java.net.Socket;
public class Sockclient
{
        public static void main (String[] args)throws Exception
  {
      String ip="localhost";
       int port=9999;
  
     Socket s= new Socket (ip,port);
     String str="mscit 8th sem";
     OutputStreamWriter os=new OutputStreamWriter(s.getOutputStream());
     PrintWriter out=new PrintWriter(os);
     out.println(str);
     os.flush();
     BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
     String str2=br.readLine();
     System.out.println("c:Data from server" + str2);
}
}
 