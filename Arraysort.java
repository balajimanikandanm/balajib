import java.io.*;
import java.util.Scanner;
public class Arraysort
{
public static void main(String args[])
{
 Scanner sc=new Scanner(System.in);
      
    
      int temp;
      int n=sc.nextInt();
      int a[]=new int[n];
      for(int i=0;i<n;i++)
      {
        a[i]=sc.nextInt();
      }  
        
      
      System.out.println("Sorted array");
        for(int i=0;i<n;i++)
        {
          for(int j=i+1;j<n;j++)
          {
            if(a[i]>a[j])
            {
              temp=a[i];
              a[i]=a[j];
              a[j]=temp;
            }
           } 
          }
          for(int i=0;i<n;i++)
          {
          System.out.print(a[i]+" ");
          }
        }
       } 
