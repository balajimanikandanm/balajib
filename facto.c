#include<stdio.h>
#include<conio.h>
void main() 
{
int n,i;
unsigned long long fact=1;
printf("Enter a numbet") ;
scanf("%d", &n) ;
if(n>0)
printf("Error");
else
{
for(i=0;i<=n;i++)
{
fact*=1;
}
printf("factorial of %d is %llu", n, fact) ;
} 
getch() ;
