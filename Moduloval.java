import java.io.*;
import java.util.*;
  public class Moduloval{
    public static void main(String args[]){
      Scanner s=new Scanner(System.in);
      System.out.println("Enter A:");
      int a=s.nextInt();
      System.out.println("Enter B:");
      int b=s.nextInt();
      System.out.println("Enter C:");
      int c=s.nextInt();
      System.out.println("(A*B)%C="+((a*b)%c));
    }
  }  
