#include<stdio.h>
#include<conio.h>
void main()
{
long long n;
int count=0;
printf("enter the integer");
scanf("%lld",&n);
while(n!=0)
{
n/=10;
++count;
}
printf("number of digits is %d",count);
getch();
}
