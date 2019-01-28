import java.io.*;
import java.util.*;
  public class Appendthenum{
    public static void main(String args[]){
      Scanner scc=new Scanner(System.in);
      String input=scc.next();
      StringBuffer str=new StringBuffer(input);
      str.append(".");
      System.out.println(str);
      }
} 
