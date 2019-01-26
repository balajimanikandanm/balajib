import java.io.*;
import java.util.*;
  public class Evenmin{
    public static void main(String args[]){
      Scanner s=new Scanner(System.in);
      System.out.println("Enter any Nuumber:");
      int a=s.nextInt();
      if(a%2==0)
      {
        System.out.println("-->"+a);
      }
      else
      {
        System.out.println("-->"+(a-1));
      }
     }
} 
