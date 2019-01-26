import java.io.*;
import java.util.*;
  public class LCMCheck{
    public static void main(String args[]){
      Scanner s=new Scanner(System.in);
      System.out.println("Enter a Integer:");
      int a=s.nextInt();
	  int ac=a;
	  System.out.println("Enter b Integer:");
      int b=s.nextInt();
	  int bc=b;
      while(a != b)
        {
            if(a > b)
                a -= b;
            else
                b -= a;
        }
		int ans=(ac*bc)/a;
        System.out.println("LCM = " +ans);
     }
} 
