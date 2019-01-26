import java.io.*;
import java.util.*;
  public class Vowelcheck{
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter any String");
    String str=sc.nextLine();
    int ans=0;
    for(int i=0;i<str.length();i++)
    {
    if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u')
    {
    ans=1;
    }
    }
    if(ans==1)
    {
    System.out.println("Vowel Present");
    }
    else
    {
    System.out.println("Vowel Not Present");
    }
   }
  } 
    
