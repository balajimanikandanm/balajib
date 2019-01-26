import java.io.*;
import java.util.*;
  public class NumberPresent{
     public static void main(String args[]){
      Scanner ssc=new Scanner(System.in);
      System.out.println("Enter N value");
      int n=ssc.nextInt();
      int ans=0;
      System.out.println("Enter L value:");
      int l=ssc.nextInt();
      System.out.println("Enter R Value:");
      int r=ssc.nextInt();
      for(int i=l;i<=r;i++)
      {
      if(i==n)
      {
      ans=1;
      }
      }
      if(ans==1)
      {
      System.out.println("PResent");
      }
      else{
      System.out.println("Not Present");
      }
     }
   } 
