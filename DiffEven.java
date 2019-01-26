import java.io.*;
import java.util.*;
  public class DiffEven{
    public static void main(String args[]){
     Scanner ss=new Scanner(System.in);
     System.out.println("Enter 2 Number:");
     int a=ss.nextInt();
     int b=ss.nextInt();
     if((b-a)%2==0){
     System.out.println("EVEN");
     }
     else{
     System.out.println("ODD");
     }
   }
} 
