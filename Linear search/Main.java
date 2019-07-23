#include<stdio.h>
int main()
{
  int array[100], e1, i, n;
  scanf("%d", &n);
  for(i = 0; i < n; i++)
  {
    scanf("%d", &array[i]);
  } 
  scanf("%d", &e1);
  int isFound = 0,e1_index;
  for(i = 0; i < n; i++)
  {
    if(array[i] == e1) 
    {
      e1_index = i;
      isFound = 1;
      break;
    }
  }
  if(isFound == 1)
  {
    printf("%d",e1_index+1);
  }
  else 
  {
    printf("%d isn't present in the array. \n", e1);
  } 
  return 0;
}