import java.io.*;
import java.util.*;
  public class PerfectSquare{
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Two Integers");
    int a=sc.nextInt();
    int b=sc.nextInt();
    if(Math.pow(a,b)==(a*b))
    {
    System.out.println("Perfect Square");
    }
    else{
    System.out.println("Not a Perfect Square");
    }
  }
} 
