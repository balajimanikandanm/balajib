import java.io.*;
import java.util.*;
  public class Rangepblm{
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter Any Intger [1-10]");
      int in=sc.nextInt();
      if(in>=1 && in<=10)
      {
      System.out.println("YES");
      }
      else
      {
      System.out.println("NO");
      }
    }
} 
