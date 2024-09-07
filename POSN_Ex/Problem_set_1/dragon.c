#include <stdio.h>

int main(){
    float a, b, c, food;
    scanf("%f %f %f %f", &a, &b, &c, &food);
    int ans = (int)(food / (a + b + c));
    printf("%d", ans);
}