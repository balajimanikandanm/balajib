import java.io.*;
import java.util.*;
  public class GcdCheck{
    public static void main(String args[]){
      Scanner sc1=new Scanner(System.in);
      System.out.println("Enter a Integer:");
      int a=sc1.nextInt();
	  System.out.println("Enter b Integer:");
      int b=sc1.nextInt();
      while(a != b)
        {
            if(a > b)
                a -= b;
            else
                b -= a;
        }

        System.out.println("GCD = " + a);
     }
} 
