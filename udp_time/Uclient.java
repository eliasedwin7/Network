import java.net.*;
import java.io.*;
import java.util.*;

public class Uclient{
	public static void main(String args[])throws Exception
  {

			DatagramSocket ds= new DatagramSocket(2000);
      DatagramPacket dpack;
		

        byte[] arr1=new byte[100];
        dpack=new DatagramPacket(arr1,arr1.length);
        ds.receive(dpack);
        byte[] arr2=dpack.getData();
        String str=new String(arr2);
        System.out.println("Server:"+str);
      
}
}
