package SSocket;

import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.ServerSocket;
import java.io.*;

public class Ser
{
public static void main(String args[]) throws Exception
{
String usern="Nabajit";
String pass="Bora";
System.out.println("Server Started");
ServerSocket ss = new ServerSocket(9999);
System.out.println("Waiting for client");
Socket s=ss.accept();
System.out.println("Client Connected");
BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
String str=br.readLine();
String str1=br.readLine();
if((str.equals(usern)==true) && (str1.equals(pass)==true))
{
System.out.println("Login Successful" );
System.out.println("Welcome To Server :: " +str);
}
else if((str.equals(usern)==true))
{
	System.out.println("Login Failed . . . .  Wrong Password");
}
else if((str1.equals(pass)==true))
{
	System.out.println("Login Failed . . . .  Wrong User Name");
}
else
{
	System.out.println("Login Failed . . . .  Both User Name and Password Are Wrong");
}

ss.close();  
}
}

