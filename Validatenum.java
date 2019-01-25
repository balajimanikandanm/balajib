import java.io.*;
import java.util.*;
public class Validatenum
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter value");
String n=sc.nextLine();
try
{
if(Integer.parseInt(n)==Integer.valueOf(n)
{
System.out.println(n+"is an integer");
}
}
catch(Exception e)
{
system.out.println("not integer");
}
}
}
