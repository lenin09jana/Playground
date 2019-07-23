#include<stdio.h>
int main()
{
  int dia ;
  float r,area ;
  scanf("%d",&dia) ;
  r = (float) dia/2 ;
  area = 3.14*r*r ;
  printf("%0.2f",area) ;
  return 0;
}