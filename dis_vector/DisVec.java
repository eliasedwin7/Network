import java.io.*;
import java.util.*;
import java.util.Scanner;

public class DisVec
{
static int graph[][],via[][],rt[][],v,e;


public static void main(String[] args) {

Scanner sc = new Scanner(System.in);
  System.out.println("enter the no of edges");
       int e = sc.nextInt();
  System.out.println("enter the no of vertices");
            int v = sc.nextInt();

        graph=new int [v+1][v+1];
        via=new int[v][v];
        rt=new int[v][v];

        for (int i=0;i<v;i++) {
          for (int j=0;j<v;j++ ) {

            if(i==j)
              graph[i][j]=0;
              else
              graph[i][j]=9999;

          }

        }
        for (int i=0;i<v;i++) {
          for (int j=0;j<v;j++){
          System.out.print(graph[i][j]+"\t");
        }
      System.out.println("\n");}


for (int i=0;i<=e;i++) {
  System.out.println("enter the connection data of edge "+(i+1)+":");
  System.out.println("Source:");
   int s = sc.nextInt();
   System.out.println("Destination");
    int d = sc.nextInt();
    System.out.println("cost:");
     int c = sc.nextInt();
     graph[s][d]=c;
     graph[d][s]=c;
}
for (int i=0;i<v;i++) {
  for (int j=0;j<v;j++){
  System.out.print(graph[i][j]+"\t");
}
System.out.println("\n");}

//dvr_calc_disp("initial routing table\n");


}}
