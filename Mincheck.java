import java.io.*;
import java.util.*;
  public class Mincheck{
    public static void main(String args[]){
      Scanner ssc=new Scanner(System.in);
      System.out.println("Enter 10 Numbers");
      int a[]=new int[10];
      for(int i=0;i<10;i++)
      {
      a[i]=ssc.nextInt();
      }
      System.out.println("--------");
      int min=a[0];
      for(int i=0;i<10;i++)
      {
        if(a[i]<min)
        {
         min=a[i];
        }
      }
      System.out.println("MIn Element:"+min);
     }
} 
