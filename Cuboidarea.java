import java.io.*;
import java.util.*;
  public class Cuboidarea{
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter L:");
      int len=sc.nextInt();
      System.out.println("Enter B:");
      int b=sc.nextInt();
      System.out.println("Enter H:");
      int h=sc.nextInt();
      System.out.println("AREA:"+((2*len*b)+(2*len*h)+(2*b*h)));
      System.out.println("SURFACE:"+(len*b*h));
      }
} 
