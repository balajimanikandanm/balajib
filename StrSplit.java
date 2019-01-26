import java.io.*;
import java.util.*;
  public class StrSplit{
    public static void main(String args[]){
    Scanner scc=new Scanner(System.in);
    System.out.println("Enter a string");
    String str=scc.nextLine();
    String str1[]=str.split("\\;");
    for(int i=0;i<str1.length;i++)
    {
    System.out.println(" "+str1[i]);
    }
   }
}
