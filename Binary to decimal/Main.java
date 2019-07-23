#include<stdio.h>
#include <math.h>
int convertBinaryToDecimal(long long n);
int main()
{
    long long n;
    scanf("%lld", &n);
    printf("%d",convertBinaryToDecimal(n));
}
int convertBinaryToDecimal(long long n)
{
    int decimalNumber = 0, i = 0, remainder;
    while (n!=0)
    {
        remainder = n%10;
        n /= 10;
        decimalNumber += remainder*pow(2,i);
        ++i;
    }
    return decimalNumber;
}