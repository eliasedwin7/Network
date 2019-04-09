import java.io.*;
import java.net.*;

public class Server {
    public static void main(String args[]) throws IOException {
        ServerSocket ss = null;
        while (true) {
        try {
            ss = new ServerSocket(1187);
        } catch (IOException u1) {
            System.out.println("could not find port 1187");
            System.exit(1);
        }
        Socket s = null;
        try {
            s = ss.accept();
            System.out.println("connection frame:" + s);
        } catch (IOException e) {
            System.out.println("accept failed");
            System.exit(1);
        }
        PrintWriter  out = new PrintWriter(s.getOutputStream(),true);
        BufferedReader br1 = new BufferedReader(new InputStreamReader(s.getInputStream()));

    
