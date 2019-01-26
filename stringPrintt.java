import java.io.*;
import java.util.*;
  public class stringPrintt{
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter A String:");
      String in=sc.nextLine();
      char str=in.toCharArray();
      System.out.println("Enter A Range:");
      int range=sc.nextInt();
      for(int i=0;i<range;i++)
      {
      System.out.print(str[i]);
      }
     }
    } 
