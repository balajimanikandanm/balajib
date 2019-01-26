import java.io.*;
import java.util.*;
  public class PoweofNr{
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in); 
      System.out.println("Enter Base");
      int b=sc.nextInt();
      System.out.println("Enter Power:");
      int p=sc.nextInt();
      System.out.println(+b+"^"+p+"="+(Math.pow(b,p)));
      }
} 
