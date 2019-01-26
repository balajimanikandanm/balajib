mport java.io.*;
import java.util.*;
  public class PrdEven{
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter two Integers:");
      int aa=sc.nextInt();
      int bb=sc.nextInt();
      int cc=aa*bb;
      if(cc%2==0)
      {
      System.out.println("EVEN");
      }
      else
      {
      System.out.println("ODD");
      }
    }
} 
