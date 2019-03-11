import java.io.*;
import java.net.*;

public class Server {
    public static void main(String args[]) throws IOException {
        ServerSocket ss = null;
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
        String fileName = br1.readLine();
        File f = new File(fileName);
        if (f.exists()) {
            long pid = Long.parseLong(java.lang.management.ManagementFactory.getRuntimeMXBean().getName().split("@")[0]);
            out.write("Process id is:"+pid+"\nFile contents are: ");
            BufferedReader in = new BufferedReader(new FileReader(fileName));
            String v;
            while ((v = in.readLine()) != null) {
                out.write(v);
                out.flush();
            }
            in.close();
            System.out.println("File served");
        }
        else{
            out.write("File not found");
            out.flush();
            System.out.println("File not found");
        }
        s.close();
        ss.close();
    }
}