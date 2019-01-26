import java.io.*;
import java.util.*;
  public class SumOfNum{
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter N value:");
      int nn=sc.nextInt();
      int a[]=new int[n];
      int sum=0;
      System.out.println("Enter The Elements:");
      for(int i=0;i<nn;i++)
      {
        a[i]=sc.nextInt();
      }
      for(int j=0;j<nn;j++)
      {
        sum=sum+a[j];
      }  
     System.out.println("SUM:"+sum);
    }
} 
