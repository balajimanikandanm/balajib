import java.io.*;
import java.util.*;
  public class Countit{
    public static void main(String args[]){
      Scanner ss=new Scanner(System.in);
      System.out.println("Enter Number:");
      int a=ss.nextInt();
	  int b=(int)Math.ceil(Math.log10(a));
	  System.out.println("Count NUmber:"+b);
      }
} 
