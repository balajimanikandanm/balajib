import java.io.*;
import java.util.*;
  public class Binaryreq{
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter A String:");
      String in=sc.next();
      char str[]=in.toCharArray();
      int ans=0;
      for(int i=0;i<str.length;i++)
      {
      if(str[i]=='0' || str[i]=='1')
      {
      ans=1;
      }
      else
      {
      ans=0;
      }
      }
      if(ans==1)
      {
      System.out.println("YES!Binary Rep");
      }
      else if(ans==0)
      {
      System.out.println("NO!");
      }
      else
      {
      System.out.println("INVALID INPUT");
      }
}
