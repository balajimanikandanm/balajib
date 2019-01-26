import java.io.*;
import java.util.*;
  public class Squarecheck{
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      System.out.println("Entet any Integer To check whether it's a sqrt of 2");
      int a=sc.nextInt();
      if(Math.sqrt(a)==2){
      System.out.println("YES");
	  }
      else
      {
      System.out.println("NO");
      }
     }
   }  
