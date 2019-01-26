import java.io.*;
import java.util.*;
  public class IsogramCheck{
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a String");
      String str=sc.nextLine();
      int answer=0;
      for(int i=0;i<str.length();i++)
        {
          for(int j=0;j<str.length;j++)
            {
              if(str.charAt(i)==str.charAt(j))
              {
              answer=0;
              }
              else
              {
              answer=1;
              }
            }
        }
      if(answer==1)
      {
      System.out.println("The String is isomorphic");
      }
      else if(answer==0)
      {
      System.out.println("The String is not isomorphic");
      }
   }
} 
