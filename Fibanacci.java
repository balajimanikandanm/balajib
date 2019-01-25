import java.io.*;
import java.util.*;
 public class Fibanacci{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Fibanacci Range:");
    int range=sc.nextInt(System.in);
    int temp=0;
    for(int i=0;i<range;i++);
    {
    temp=temp+i;
    System.out.println(temp);
    }
   }
} 
