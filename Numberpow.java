import java.io.*;
import java.util.*;
import java.lang.*;

  public class Numberpow{
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      System.out.println("Entet Any Number:");
      int a=sc.nextInt();
      int b=(int)Math.ceil(Math.sqrt(a));
      int c=b+1;
      int ans=(int)Math.pow(2,c);
      System.out.println("RESULT:"+ans);
      }
} 
