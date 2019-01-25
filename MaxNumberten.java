import java.io.*;
import java.util.*;
  public class MaxNumberten{
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the Number Count:");
      int range=sc.nextInt();
	  int num[]=new int[range];
      System.out.println("Entetr the Numbers:");
      for(int i=0;i<range;i++)
      {
        num[i]=sc.nextInt();
      }
      System.out.println("---------");
      for(int j=0;j<range;j++)
      {
        System.out.println(num[j]);
      }
      int max=num[0];
      for(int k=0;k<range;k++)
      {
        if(num[k]>max)
        {
          max=num[k];
        }
      }
       System.out.println("---------");
      System.out.println("MAX:"+max);
     }
} 
