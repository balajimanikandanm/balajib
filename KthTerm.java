import java.io.*;
import java.util.*;
  public class KthTerm{
    public static void main(String args[]){
      Scanner s=new Scanner(System.in);
      System.out.println("Enter N value:");
      int n=s.nextInt();
      System.out.println("Enter K value:");
      int k=s.nextInt();
      int narr[]=new int[n];
	  System.out.println("Enter ELEMENTS");
      for(int i=0;i<n;i++)
      {
      narr[i]=s.nextInt();
      }
      System.out.println("K-->"+(narr[k-1]));
     }
} 
