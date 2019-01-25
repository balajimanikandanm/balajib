import java.io.*;
import java.util.*;
  public class Spacecount{
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter Any String");
      String in=sc.nextLine();
      System.out.println("NO.OF.Spaces in String is:");
      int c=0,i;
      for(i=0;i<in.length();i++)
      {
        if(in.charAt(i)==' ')
        {
          c++;
        }
      }
      System.out.println(c);
     }
} 
