import java.io.*;
import java.net.*;
public class client1
{
 public static void main(String args[])
 {
 DatagramSocket sock = null;
 int port;
 String s;
 //udp_client ob=new udp_client();
 BufferedReader cin = new BufferedReader(new InputStreamReader(System.in));


 try
 {
 System.out.println("Enter the port number:~");
 port=Integer.parseInt(cin.readLine());
 sock = new DatagramSocket(); //Create the socket object for carrying the data.

 InetAddress host = InetAddress.getByName("LAPTOP-DSVGU4ND");

 while(true)
 {
 //take input and send the packet
 echo("Enter message to send :~");
 s = (String)cin.readLine();
 if(s.equalsIgnoreCase("end"))
 System.exit(0);
 byte[] b = s.getBytes(); //convert the string into the byte array.

 //Create the datagramPacket for sending the data.
 DatagramPacket dp = new DatagramPacket(b , b.length , host , port);
 sock.send(dp); //invoke the send call to actually send the data.

 //now receive reply
 //buffer to receive incoming data
 byte[] buffer = new byte[65536];
 DatagramPacket reply = new DatagramPacket(buffer, buffer.length);
 sock.receive(reply);

 byte[] data = reply.getData();
 s = new String(data, 0, reply.getLength());

 //echo the details of incoming data - client ip : client port - client message
 echo(reply.getAddress().getHostAddress() + " : " + reply.getPort() + " - " + s);
 }
 }

 catch(IOException e)
 {
 System.err.println("IOException " + e);
 }
 }

 //simple function to echo data to terminal
 public static void echo(String msg)
 {
 System.out.println(msg);
 }
}
