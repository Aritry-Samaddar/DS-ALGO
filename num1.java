import java.io.*;
import java.net.*;
class num1
{
public static void main(String args[])throws Exception
{
 int i;
BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
System.out.println("\nEnter server name:");
String name=in.readLine();
InetAddress[] me=InetAddress.getAllByName(name);
for(i=0;i<me.length;i++){
System.out.println(me[i]);
}
System.out.println("The no.of nodes connected are:"+me.length);
System.out.println("The no of nodes running :"+i);
}}
