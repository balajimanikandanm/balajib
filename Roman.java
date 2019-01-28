import java.io.*;
import java.util.*;

class Check{
        public void fun(String input){
        
        switch(input){
        case "I":System.out.println("ONE");
               break;
        case "II":System.out.println("TWO");
               break;
        case "III":System.out.println("THREE");
               break;
        case "IV":System.out.println("FOUR");
               break;
        case "V":System.out.println("FIVE");
               break;
        case "VI":System.out.println("SIX");
               break;
        case "VII":System.out.println("SEVEN");
               break;
        case "VIII":System.out.println("EIGHT");
               break;
        case "IX":System.out.println("NINE");
               break;
        case "X":System.out.println("TEN");
               break;
        case "XI":System.out.println("ELEVEN");
               break;
        case "XII":System.out.println("THIRTEEN");
               break;
        default:System.out.println("INVALID ROMEN");       
                break;
        }        
        
      }
	}  


  public class Roman{
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      Check c=new Check();
      System.out.println("Enter a Valid Roman Letter");
      String input=sc.next();
      c.fun(input);
      } 
} 
