import java.io.*;
import java.util.*;
  public class Multipleten{
    public static void main(String args[]){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter Any Number:");
     int a=sc.nextInt();
     while((a%10)!=0){
		 a++;
	 }
	 System.out.println("Ans :"+a);
		 
   }
}
