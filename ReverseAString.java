import java.io.*;
import java.util.*;

  public class ReverseAString{
    public static void main(String args[]){
      Scanner sc1=new Scanner(System.in);
      System.out.println("Enter A String:");
      String input=sc1.next();
        if(input.length()<=100000){
          StringBuffer s=new StringBuffer(input);
          String output=s.reverse().toString();
          System.out.println(output);
          }
          else{
          System.out.println("String Size Is Too High");
          }
       }
} 
