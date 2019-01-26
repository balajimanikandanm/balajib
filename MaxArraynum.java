import java.io.*;
import java.util.*;
  public class MaxArraynum{
    public staic void main(String args[]){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter array Range:");
      int range=sc.nextInt();
      int arr[]=new int[range];
      System.out.println("Enter the elements:");
      for(int i=0;i<range;i++)
      {
      arr[i]=sc.nextInt();
      }
      int max=arr[0];
      int min=arr[range-1];
      for(int j=0;j<range;j++)
      {
      if(arr[j]>max)
      {
      max=arr[j];
      }
      else if(arr[j]<max)
      {
      min=arr[j];
      }
     }
     System.out.println("Max:"+max);
     System.out.println("Min:"+min);
    }
} 
