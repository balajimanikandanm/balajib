import java.io.*;
import java.util.*;
public class Arrayindex
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter array size");
int size=sc.nextInt();
int value=new int(size);
for(int i=0;i<size;i++)
{
value[i]=sc.nextInt();
}
for(int i=0;i<size;i++)
{
System.out.println(value[i]+""+i);
}
}
}
