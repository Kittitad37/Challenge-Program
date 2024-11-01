#include <stdio.h>

int my_function(int n)
{
    if (n == 0)
        return 3;
    else
        return 1 + my_function(n - 1);
}

int main()
{
    // int input, max = 0;
    // scanf("%d", &input);
    // int height[input];
    // for (int i = 0; i < input; ++i)
    // {
    //     scanf("%d", &height[i]);
    //     if (height[i] >= max)
    //         max = height[i];
    // }
    // for (int i = 0; i < max; ++i)
    // {
    //     for (int j = 0; j < input; ++j)
    //     {
    //         for (int k = 0; k < height[j]; ++k)
    //             i + k == max - 1 ? printf("/") : printf(" ");
    //         for (int k = height[j] - 1; k >= 0; --k)
    //             i + k == max - 1 ? printf("\\") : printf(" ");
    //     }
    //     printf("\n");
    // }
    // return 0;
    printf("%d" , my_function(5));
}