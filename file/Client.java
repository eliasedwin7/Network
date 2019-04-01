import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Client {
  public static void main(String[] args) throws IOException {
    Socket s=null;
    try{
    s=new Socket(InetAddress.getLocalHost(),1187);
    System.out.println("Server Connected");
}catch (Exception e) {
  System.out.println(e);
  System.exit(1);

}
System.out.println("Enter the File Name");
/*Scanner sc = new Scanner(System.in);
  String name = sc.nextLine();
  PrintWriter pw1 = new PrintWriter(s.getOutputStream(),true);
       pw1.println(name);
       */

       BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
      PrintWriter pw1 = new PrintWriter(s.getOutputStream(),true);
      pw1.println(br1.readLine());
/*
Scanner sc = new Scanner(s.getInputStream());
  String name = sc.nextLine();
*/
       BufferedReader br2 = new BufferedReader(new InputStreamReader(s.getInputStream()));
       String inp;
       while((inp = br2.readLine()) != null){
           System.out.println(inp);
       }
       br2.close();
       s.close();

  }

}
