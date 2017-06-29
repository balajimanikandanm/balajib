#include<stdio.h>
#include<conio.h>
void main()
{
char c;
clrscr();
printf("enter the character");
scanf("%c",&c);
if((c>='a'&&c<='z')||(c>='A'&&c<='z'))
printf("it is alphabet");
else
printf("it is not alphabet");
getch();
}
