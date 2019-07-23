#include<stdio.h>
int main()
{
  int i,len,count=1;
  char a[100];
  scanf("%s",a);
  for(len=0;a[len]!='\0';len++);
  if(len>20)
    printf("Invalid Input");
  else
  {
    for(i=0;a[i]!='\0';i++)
  {
    if(a[i]==a[i+1])
    {
      count++;
    }
    else
    {
      printf("%c%d",a[i],count);
      count=1;
    }
    }
  }
}