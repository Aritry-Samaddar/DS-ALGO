import java.net.*;
import java.util.*;
import java.io.*;
public class ip {
    public static void main(String args[]) {
      Scanner obj = new Scanner(System.in);
      String target;
      target = obj.nextLine();
      try{
          System.out.println(target);
          InetAddress ip = InetAddress.getByName(target);
          System.out.println("\n Ip address of input site " + target + " is " + ip.getHostAddress());
      } catch(UnknownHostException ex){
          System.out.println("\n Not Found\n");
          ex.printStackTrace();
      }
    }
}