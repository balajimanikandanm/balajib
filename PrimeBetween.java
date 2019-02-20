import java.io.*;
import java.util.*;
class PrimeBetween
{
public static void main(String[] args)
{
int l,r,countt=0,i,j;
Scanner sc=new Scanner(System.in);
l = sc.nextInt();
r = sc.nextInt();
for(i=l;i<=r;i++)
{
for(j=2;j<i;j++)
{
if(i % j == 0)
				{
					countt = 0;
					break;
				}
				else
				{
					countt = 1;
				}
			}
			if(countt == 1)
			{
				System.out.println(i);
			}
		}
	}
}
