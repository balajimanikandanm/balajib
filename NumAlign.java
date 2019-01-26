import java.io.*;
import java.util.*;
  public class NumAlign{
      public static void main(String args[]){
        Scanner ss=new Scanner(System.in);
        System.out.println("Enter any number:");
        int in=ss.nextInt();
        int a1,b1=0,c1,d1=0;
        while(in>0)
        {
          a1=in%10;
          b1=(b1*10)+a1;
          in=in/10;
         }
        while(b1>0)
        {
        c1=b1%10;
        d1=(d1*10)+c1;
        b1=b1/10;
        }
        System.out.println(d1);
      }
} 
