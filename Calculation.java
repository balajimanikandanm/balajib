import java.io.*;
import java.util.*;
  public class Calculation{
    public static void main(String args[]){
      Scanner s=new Scanner(System.in);
      System.out.println("Enter the Inputs");
      int num1=s.nextInt();
      char in=s.next().charAt(0);
      int num2=s.nextInt();
      if(in=='/'){
      System.out.println("ANS:"+(num1/num2));
      }
      else if(in=='%')
      {
      System.out.println("ANS:"+(num1%num2));
      }
      else
      {
      System.out.println("Invalid");
      }
    }
  }  
