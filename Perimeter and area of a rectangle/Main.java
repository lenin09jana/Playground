#include<stdio.h>
int main()
{
  int l=6;
  int b=9;
  int perimeter,area;
  perimeter = 2 * (l +b );
  area = l * b ;
  printf("The perimeter of the rectangle is: %d cm\nThe area of the rectangle is: %d sq cm", perimeter, area);
  return 0 ;
}