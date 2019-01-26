import java.io.*;
import java.util.*;

class Recursion{
    void fun(int a)
    {
     if(a/2==0)
     {
     System.out.println("----------");
     }
     else
     {
     int ans=a/2;
     System.out.println(ans);
     fun(ans);
     }
    }
   } 

  public class Recursive{
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      Sub s=new Sub();
      System.out.println("Enter a number to start:");
      int a=sc.nextInt();
      s.fun(a);
      }
} 
