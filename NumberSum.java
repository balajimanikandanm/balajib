import java.io.*;
import java.util.*;
  public class NumberSum{
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter Any Number");
      int inn=sc.nextInt();
      int a,b=0;
      while(inn>0){
      a=inn%10;
      b=b+a;
      inn=inn/10;
      }
      System.out.println("SUM:"+b);
    }
} 
