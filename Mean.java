import java.io.*;
import java.util.*;
import java.lang.*;
  public class Mean{
    public static void main(String args[]){
       Scanner s=new Scanner(System.in);
       System.out.println("Enter a Range:");
       int range=s.nextInt();
       int a[]=new int[range];
       int temp=0;
       for(int i=0;i<range;i++)
       {
        a[i]=s.nextInt();
       }
       for(int j=0;j<range;j++)
       {
       temp=temp+a[j];
       }
	    System.out.println("Average:"+(int)Math.ceil(temp/range));
      }
} 
