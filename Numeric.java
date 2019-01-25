import java.io.*;
import java.util.*;
  public class Numeric{
    public static void main(String args[]){
      Scanner c=new Scanner(System.in);
      System.out.println("Enter Any String");
      String in=c.nextLine();
      System.out.println("Number Of Numberic Char In your String is:");
      int count=0,i;
      for(i=0;i<in.length();i++)
      {
        if(Character.isDigit(in.charAt(i)))
        {
          count++;
        }
      }
      System.out.println(count);
     }
}
