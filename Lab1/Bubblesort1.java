import java.util.*;
public class Bubblesort1
{
        public static void main(String args[])
        { 
        int i,j,count=0;
                Scanner sc = new Scanner(System.in);
                 System.out.println("Enter the array limit"); 
                int n = sc.nextInt(); 
                int S[]=new int[n];
                 System.out.println("Enter the array elements");
                 for(i=0;i<n;i++)
                 {
                  
                 S[i] = sc.nextInt();
                }
                 for(i=0;i<n;i++)
                 {
                  for(j=i+1;j<n;j++)
                  {
                  if(S[i]<S[j])
                  {
                  int temp=S[i];
                  S[i]=S[j];
                  S[j]=temp;
                  }
                  }
                  }
                   System.out.println("the array elements are desc\n");
                 for(i=0;i<n;i++)
                 {
                   System.out.print(S[i]);
                }
                System.out.println("\n");
                
                System.out.println("the array elements are asc \n");
                 for(i=n-1;i>=0;i--)
                 {
                   System.out.print(S[i]);
                }
                System.out.println("\n");
   
                }
                }
                 
