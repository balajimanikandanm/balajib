#include<stdio.h>
#include<conio.h>
void main()
{
int a,n,c,sum=0;
printf("enter the no of integers");
scanf("%d",&n);
for(c=1;c<=n;c++)
{
scanf("%d",&a);
sum=sum+a;
}
printf("sum=%d",sum);
getch();
}
