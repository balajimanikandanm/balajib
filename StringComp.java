import java.io.*;
import java.util.*;
   public class StringComp{
    public static void main(String args[]){
     Scanner sc=new Scanner(System.in);
     int a,b,ans;
     System.out.println("Enter Tow String to compare");
     String int1=sc.nextLine();
     String int2=sc.nextLine();
     for(int i=0;i<in1.length() && i<in2.length();i++)
     {
      a=int1.charAt(i);
      b=int2.charAt(i);
      if(a>b)
      {
      ans=1;
      }
      else if(a<b)
      {
      ans=-1;
      }
     }
     if(ans==1)
     {
     System.out.println(int1);
     }
     else
     {
     System.out.println(int2);
     }
   }
} 
