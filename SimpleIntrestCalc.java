import java.io.*;
import java.util.*;
  public class SimpleIntrestCalc{
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter Priciple amount:");
      int pr=sc.nextInt();
      System.out.println("Enter time:");
      int ti=sc.nextInt();
      System.out.println("Enter Rate:");
      int rt=sc.nextInt();
      System.out.println("SIMPLE INTREST:"+((pr*ti*rt)/100));
      }
} 
