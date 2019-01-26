import java.io.*;
import java.util.*;
  public class Checkpresent{
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter Two Key Values N&K");
      int n=sc.nextInt();
      int k=sc.nextInt();
      int ans=0;
      System.out.println("Enter Any 5 values:");
      int in[]=new int[5];
      for(int i=0;i<5;i++)
      {
      in[i]=sc.nextInt();
      }
      for(int i=0;i<5;i++)
      {
      if(k==in[i])
      {
      ans=1;
      }
      }
      if(ans==1){
      System.out.println("K value is present");
      }
    }
}
