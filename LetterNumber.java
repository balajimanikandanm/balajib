import java.io.*;
import java.util.*;
  public class LetterNumber{
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter Any String");
      String in=sc.nextLine();
      char a[]=in.toCharArray();
      int letter=0;
      int num=0;
      for(int i=0;i<a.length;i++)
      {
        if(a[i]>='A'&&a[i]<='Z' || a[i]>='a'&&a[i]<='z')
        {
        letter=1;
        }
        else if(a[i]>='0' && a[i]<='9')
        {
        num=1;
        }
       }
       if(letter==1 && num==1)
       {
       System.out.println("YES");
       }
       else
       {
        System.out.println("NO");
       }
     }
} 
