import java.util.*;
public class DUPLICATE
{
        public static void main(String args[])
        { 
        int i,j,count=0;
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter the string");  
                String str = sc.nextLine();
                char[] c=str.toCharArray();
                for(i=0;i<str.length();i++)
                {
                        for(j=i+1;j<str.length();j++)
                        {
                                if(c[i]==c[j])
                                {
                                  System.out.println("Duplicate element="+c[j]);
                                  count++;
                                  break;
                                  } 
                                 }
                                 }
                                   System.out.println("String count"+count); 
                                 }
                                 }
                
                 

