import java.io.*;
import java.util.*;
  public class NumOdd{
     public static void main(String args[]){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter any Number");
     String str=sc.nextLine();
     for(int i=0;i<str.length();i++)
     {
     if(str.charAt(i)%2!=0)
     {
     System.out.print(str.charAt(i)+" ");
     }
     }
   }
} 
