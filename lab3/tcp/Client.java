import java.io.*;
import java.net.*;
import java.util.*;


public class Client
        {
        public static void main(String[] args) throws Exception
        {
        Socket sock=new Socket("127.0.0.1",3001);
         BufferedReader keyread=new BufferedReader(new InputStreamReader(System.in));
        OutputStream ostream=sock.getOutputStream();
        PrintWriter pwrite=new PrintWriter(ostream,true);
        InputStream istream=sock.getInputStream();
        BufferedReader rread=new BufferedReader(new InputStreamReader(istream));
        String rsmg,smsg;
        while(true)
        {
         
                        smsg=keyread.readLine();
                        pwrite.println(smsg);
                        pwrite.flush();
                        
                if((rsmg=rread.readLine())!=null)
                {
                      System.out.println(rsmg); 
                        }
                        
                        }}
                        }
        
