import java.net.*;
import java.io.*;
import java.util.*;

public class Userver{
	public static void main(String args[] )throws Exception
  {
		DatagramSocket ds= new DatagramSocket();
    InetAddress addr=InetAddress.getLocalHost();
    System.out.println("Server ready.......\n");
    while(true)
    {
      Thread.sleep(1000);
      Date currentDate=new Date();
      String s1=currentDate.toString();
      byte arr[]=s1.getBytes();

      DatagramPacket dpack=new DatagramPacket(arr,arr.length,addr,2000);
      ds.send(dpack);

    }
  }
}
