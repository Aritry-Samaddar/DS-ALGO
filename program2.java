import java.io.*;
import java.util.*;
public class program2
{
public static void runSystemCommand(String Command)
{
try{
Process p=Runtime.getRuntime().exec(Command);
BufferedReader InputStream=new BufferedReader(new InputStreamReader(p.getInputStream()));
String s="";

while((s=InputStream.readLine())!=null)
{
System.out.println(s);
}
}
catch(Exception e)
{
e.printStackTrace();
}
}
public static void main(String[]args)
{
Scanner sc = new Scanner(System.in);
String Ip=sc.nextLine();
runSystemCommand("tracert " +Ip);
java.util.Date date=new java.util.Date();
System.out.println(date);
}
}