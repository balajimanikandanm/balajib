mport java.io.*;
import java.util.*;
  public class StringConcat{
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter Two String To Concat:");
      String in1=sc.nextLine();
      String in2=sc.nextLine();
      System.out.println(in1+""+in2);
      }
} 
