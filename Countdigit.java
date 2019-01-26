import java.io.*;
import java.util.*;
  public class Countdigit{
    public static void main(String args[]){
      Scanner scc=new Scanner(System.in);
      System.out.println("Enter Number:");
      int a=scc.nextInt();
	    int b=(int)Math.ceil(Math.log10(a));
	    System.out.println("Count NUmber:"+b);
    }
} 
