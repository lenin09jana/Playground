#include<stdio.h>
int main() 
{
  float a ;
  float r ;
  scanf ("%f", & r) ;
  float c ;
  scanf ("%f", & c) ;
  a = 2 * 3.14 * r * ( c / 360 ) ;
  printf ("%.2f", a) ;
  return 0 ;
} 