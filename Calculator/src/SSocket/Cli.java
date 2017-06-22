package SSocket;



import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Cli
{
public static void main(String[] args) throws Exception
{
Socket s=new Socket("localhost",9999); 

OutputStreamWriter B= new OutputStreamWriter(s.getOutputStream());
System.out.println("Enter User Name");
Scanner sc=new Scanner(System.in);
String s1=sc.nextLine();
System.out.println("Enter Password");
String s2=sc.nextLine();
PrintWriter out=new PrintWriter(B);

out.println(s1);  
out.println(s2);
 
out.close();

s.close(); 
sc.close();
}
}