#include<stdio.h>
int isVowel(char c)
{
  if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U'||c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
  {
    return 0;
  }
  else
  {
    return 1;
  }
}

int main()
{
  char str[100],i;
  scanf("%[^\n]s", str);
  for(i=0;str[i]!='\0';i++)
  {
    if(isVowel(str[i]))
    {
      printf("%c",str[i]);
    }
  }
  return 0;
}