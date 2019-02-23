import java.util.*;
public class Rev
{
        public static void main(String args[])
        { 
        int i,j,count=0;
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter the string");  
                String str = sc.nextLine();
                String[] s1=str.split(" ");
                 System.out.println("Reversed String : "); 
                for(i=0;i<s1.length;i++)
                {
                        StringBuffer s = new StringBuffer(s1[i]);
                        System.out.print(s.reverse()+" ");
                        }
                         System.out.println(""); 
                        }
                        }  
