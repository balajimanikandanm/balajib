import java.io.*;
import java.util.*;
  public class OddOrEven{
    public static void main(String args[]){
      Scanner sc1=new Scanner(System.in);
      System.out.println("Enter Two Numbers");
      int a=sc1.nextInt();
      int b=sc1.nextInt();
      if((a+b)%2==0)
      {
      System.out.println("Even num");
      }
      else{
      System.out.println("Odd num");
      }
    }
} 
