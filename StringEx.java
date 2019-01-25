import java.io.*;
import java.util.*;
  public class StringEx{
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter Any String");
      String in=sc.nextLine();
      System.out.println("Enter how many times the string to be display:");
      int range=sc.nextInt();
      for(int i=0;i<range;i++)
      {
        System.out.println(in);
      }
  }
} 
