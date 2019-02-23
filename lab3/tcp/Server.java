import java.io.*;
import java.net.*;
import java.util.*;


public class Server
        {
        public static void main(String args[]) throws Exception
        {
        ServerSocket srsock= new ServerSocket(3001);
        System.out.println("Server ready for chatting....");
        Socket sock=srsock.accept();
        BufferedReader keyread=new BufferedReader(new InputStreamReader(System.in));
        OutputStream ostream=sock.getOutputStream();
        PrintWriter pwrite=new PrintWriter(ostream,true);
        InputStream istream=sock.getInputStream();
        BufferedReader rread=new BufferedReader(new InputStreamReader(istream));
        String rsmg,smsg;
        while(true)
        {
                if((rsmg=rread.readLine())!=null)
                {
                        System.out.println(rsmg);}
                        smsg=keyread.readLine();
                        pwrite.println(smsg);
                        pwrite.flush();
                        
                        }
                        
                        }
                        }
