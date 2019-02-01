import java.io.*;
import java.util.*;
public class IsomorphicCheck
{
public static void main(String args[])
{
int i,n,mm=0,kk=0,temp;
String a,b;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the first string");
a=sc.nextLine();
System.out.println("Enter the second string");
b=sc.nextLine();
n=a.length();
      for(i=0;i<n;i++)
          for(int j=i+1;j<n;j++)
      {
          if(a.charAt(i) == a.charAt(j))
          {
              mm=i;
              kk=j;
          }
      }
      if(b.charAt(mm)==b.charAt(kk))
      {
          System.out.println("true");
      }
      else
          System.out.println("false");

    }
 
}
