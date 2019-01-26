import java.io.*;
import java.util.*;
  public class DigitProduct{
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter A NUmber:");
      int a=sc.nextInt();
      int b,c=1;
      while(a>0)
      {
      b=a%10;
      c=c*b;
      a=a/10;
      }
      System.out.println("PRODUCT:"+c);
    }
} 
