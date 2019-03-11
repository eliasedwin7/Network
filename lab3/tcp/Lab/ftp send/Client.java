import java.io.*;
import java.net.*;

public class Client {
    public static void main(String args[]) throws IOException {
        Socket s = null;
        try {
            s = new Socket(InetAddress.getLocalHost(), 1187);
            System.out.println("Server Connected");
        } catch (Exception e) {
            System.out.println(e);
            System.exit(1);
        }
        System.out.println("Enter file name");
        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw1 = new PrintWriter(s.getOutputStream(),true);
        pw1.println(br1.readLine());

        BufferedReader br2 = new BufferedReader(new InputStreamReader(s.getInputStream()));
        String inp;
        while((inp = br2.readLine()) != null){
            System.out.println(inp);
        }
        br2.close();
        s.close();
    }
}