#include<stdio.h>
#include<math.h>
int main()
{
  float p ;
  scanf ("%f", & p) ;
  float b ;
  scanf ("%f", & b) ;
  float h ;
  h = sqrt ( (p * p) + (b * b) )  ;
  printf ("%.2f",h) ;
  return 0;
}