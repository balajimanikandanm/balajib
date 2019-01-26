import java.io.*;
import java.util.*;
import java.lang.*;
  public class Palindromenum{
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a String");
      String str=sc.next();
	  String str2="";
	  for(int i=str.length()-1;i>=0;i--)
	  {
		  str2=str2+str.charAt(i);
	  }
	  if(str.equalsIgnoreCase(str2))
	  {
		  System.out.println("Palindrome");
	  }
	  else
	  {
		  System.out.println("Not a Palindrome");
	  }
	}
} 
