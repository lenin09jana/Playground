#include<stdio.h>
int main()
{
  int i;
  char s[100],s1[100],s2[100];
  scanf("%s%s%s",s,s1,s2);
  for(i=0;s[i]!='\0';i++)
  {
    if(s[i]=='a'||s[i]=='e'||s[i]=='i'||s[i]=='o'||s[i]=='u'||s[i]=='A'||s[i]=='E'||s[i]=='I'||s[i]=='O'||s[i]=='U')
    {
      s[i]='$';
    }
  }
  for(i=0;s1[i]!='\0';i++)
  {
    if(!(s1[i]=='a'||s1[i]=='e'||s1[i]=='i'||s1[i]=='o'||s1[i]=='u'||s1[i]=='A'||s1[i]=='E'||s1[i]=='I'||s1[i]=='O'||s1[i]=='U'))
    {
    s1[i]='#';
    }
  }
   for(i=0;s2[i]!='\0';i++)
   {
     if(s2[i]>='a' && s2[i]<='z')
     {
         s2[i]=s2[i]-32;
     }
   }
  int length;
  for(length=0;s[length]!='\0';length++); 
    for(i=0;s1[i]!='\0';i++)
    {
      s[length++]=s1[i];
    }
  for(i=0;s2[i]!='\0';i++)
  {
    s[length++]=s2[i];
  }
    s[length]='\0';
  printf("%s",s); 
}