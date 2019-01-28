import java.io.*;
import java.util.*;
  public class Reversenumberpb{
    public static void main(String args[]){
      Scanner s1=new Scanner(System.in);
      System.out.println("Enter Some Integer Value:");
      int a=s1.nextInt();
      int b,ans=0;
      while(a>0)
      {
      b=a%10;
      ans=(ans*10)+b;
      a=a/10;
      }
      System.out.println(ans);
      }
} 
