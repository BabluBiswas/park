package Socket;

import java.io.BufferedReader;
import java.io.*;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.ServerSocket;
   
public class Sockserver
{
 public static void main (String[] args)throws Exception
{
  System.out.println("s:server started");
  ServerSocket ss= new ServerSocket(9999);
  System.out.println("s:Server waiting");
  Socket s = ss.accept();
  System.out.println("s: client connected");
  BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
  String str=br.readLine();
  System.out.println("s: data from client "+ str);
  String str2="Thanks Nabajit";
  OutputStreamWriter os=new OutputStreamWriter(s.getOutputStream());
  PrintWriter out=new PrintWriter(os);
  out.println(str2);
  out.flush();
  System.out.println("s:data delivered to client");
 }
}