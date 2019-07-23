#include<stdio.h>
int main()
{
  //type your code here
  char j;
  scanf("%c",&j);
  switch(j)
  {
    case 'a':
    case 'e':
    case 'i':
    case 'o':
    case 'u':
    case 'A':
    case 'E':
    case 'I':
    case 'O':
    case 'U':
      {
        //printf("c",
        printf("Vowel");
        break;
      }
    default:
      printf("Consonant");
  }
  return 0;
}