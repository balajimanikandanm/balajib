import java.io.*;
import java.util.*;
  public class Swapnum{
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter 2 Numbers");
      int a=sc.nextInt();
      int b=sc.nextInt();
      System.out.println("<---Before Swap--->");
      System.out.println("A:"+a);
      System.out.println("B:"+b);
      int t=a;
      a=b;
      b=t;
      System.out.println("<---After Swap--->");
      System.out.println("A:"+a);
      System.out.println("B:"+b);
     }
} 
