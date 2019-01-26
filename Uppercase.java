import java.io.*;
import java.util.*;
  public class Uppercase{
    public static void main(String args[]){
      Scanner scan=new Scanner(System.in);
      System.out.println("Enter Any String:");
      String str=scan.nextline();
      for(int i=0;i<str.length;i++)
      {
      if(i==str.charAt(0) || str.charAt(i-1)==" ")
      {
      System.out.println(" "+Str.charAt(i).toUpperCase);
      }
      else{
      System.out.println(" "+Str.charAt(i));
      }
      }
     }
} 
