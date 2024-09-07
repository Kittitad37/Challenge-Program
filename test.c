#include <stdio.h>
int main()
{
    int input, max = 0;
    scanf("%d", &input);
    int height[input];
    for (int i = 0; i < input; ++i)
    {
        scanf("%d", &height[i]);
        if (height[i] >= max)
            max = height[i];
    }
    for (int i = 0; i < max; ++i)
    {
        for (int j = 0; j < input; ++j)
        {
            for (int k = 0; k < height[j]; ++k)
                i + k == max - 1 ? printf("/") : printf(" ");
            for (int k = height[j] - 1; k >= 0; --k)
                i + k == max - 1 ? printf("\\") : printf(" ");
        }
        printf("\n");
    }
    return 0;
}