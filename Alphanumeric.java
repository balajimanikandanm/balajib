import java.io.*;
import java.util.*;
  public class Alphanumeric{
    public static void main(String args[]){
      Scanner s=new Scanner(System.in);
      System.out.println("Enter A String");
      String str=s.nextLine();
      for(int i=0;i<str.length();i++)
      {
        if(str.charAt(i)>='a'&& str.charAt(i)<='z' || str.charAt(i)>='A'&& str.charAt(i)<='Z')
        {
          System.out.print(" ");
        }
		    else
		    {
			    System.out.print(str.charAt(i));
		    }	
      }
    }
} 
