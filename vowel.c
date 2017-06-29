#include<stdio.h>
#include<conio.h>
void main()
{
char s;
clrscr();
printf("enter the letter");
scanf("%c",&s);
if(s=='a'||s=='e'||s=='i'||s=='o'||s=='u')
printf("it is a vowel");
else
printf("it is a consonant");
getch();
}
