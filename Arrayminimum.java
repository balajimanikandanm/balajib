import java.io.*;
public class Arrayminimum()
{
public static void main(String args[])
{
int min;
int a[]={1,4,5,6,22};
min=a[0];
System.out.println("Minimum element");
for(int i=0;i<a.length;i++)
{
int j=i+1;
if(j<a.length)
{
if(a[i]>a[j])
{
min=a[j];
}
}
}
System.out.println(min);
}
}
