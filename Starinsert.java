import java.io.*;
import java.util.*;
  public class Starinsert{
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter Any String");
      String str=sc.nextLine();
      int OvrMid=(str.length()/2);
      int mid1=0;
	  int mid2=0;
	  int mid3=0;
      if(str.length()%2==0)
      {
      mid1=OvrMid;
      mid2=OvrMid-1;
      }
      else
      {
      mid3=(int)Math.ceil(OvrMid);
	  
      }
      for(int i=0;i<str.length();i++)
      {
      if(i==mid1 ||i==mid2 && i==mid3)
      {
      System.out.print("*");
      }
      else
      {
      System.out.print(str.charAt(i));
      }
	  }
    }
} 
