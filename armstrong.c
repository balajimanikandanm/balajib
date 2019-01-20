#include<stdio.h>
#include<conio.h>
void main() 
{
int num,on, rem, re=0,n=0;
printf("Enter number:") ;
scanf("%d", &num) ;
on=num;
while(on!=0)
{
on/=10;
++n;
}
on=num;
while(on!=0)
{
re=on%10;
re+=pow(re,n);
on/=10;
}
if(re==num)
printf("%d is an Armstrong number", num) ;
else
printf("%d is not Armstrong number", num) ;
getch() ;
