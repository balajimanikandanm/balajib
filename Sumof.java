import java.io.*;
import java.util.*;
  public class Sumof{
    public static void main(String args[]){
     Scanner scc=new Scanner(System.in);
     System.out.println("Enter any Integer:");
     int a=scc.nextInt();
     int fact=0;
     for(int i=0;i<a;i++){
     fact=fact+i;
     }
     System.out.println("ANS: "+fact);
     }
} 
