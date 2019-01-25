import java.io.*;

  public class Arraymaximum{
    public static void main(String args[]){
      int max;
      int a[]={1,2,3,4,5};
      max=a[0];
      System.out.println("Max Element in an Array...");
      for(int i=0;i<=a.length;i++)
      {
      int j=i+1;
				if(j<x)
				{
				if(a[i]<a[j])
					{
						max=a[j];
					}
				}
			}
			System.out.println(max);
		}
	}
