#include <stdio.h>
#include <string.h>

int main()
{
    long a, b, c;
    scanf("%ld %ld %ld", &a, &b, &c);
    a = a % 100;
    b = b % 100;
    c = c % 100;
    printf("%ld", ((a*b*c) % 100));
}