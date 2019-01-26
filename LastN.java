import java.io.*;
import java.util.*;
  public class LastN{
    public static void main(String args[]){
      Scanner sca=new Scanner(System.in);
      System.out.println("Enter a String");
      String str=sca.nextLine();
      for(int i=str.length()-1;i>0;i--)
      {
        if(i==str.length()-1)
        {
          System.out.println(str.charAt(i));
        }
      }
    }
} 
