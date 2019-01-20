#include<stdio.h>
#include<conio.h>
void main().
{
int i,d;
clrscr() ;
printf("Enter the numver") ;
scanf("%d", &d) ;
pruntf("The first 5 multiples of %d are", d) ;
for(i=0;i<=5;i++)
{
if(i%d==0)
{
printf("%d",i);
}
}
getch();
}
