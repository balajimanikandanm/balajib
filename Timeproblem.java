import java.io.*;
import java.util.*;

    public class Timeproblem{
      public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Some Integer For Change into Hour:");
        int Input=s.nextInt();
        int Hour=Input/60;
        int Minutes=Input%60;
        System.out.println("---->"+Hour+":"+Minutes);
        }
} 
