#include <stdio.h>

int main()
{
    int grade[5] = {0, 0, 0, 0, 0};
    int qty, val;
    scanf("%d", &qty);
    for (int i = 0; i < qty; i++)
    {
        scanf("%d", &val);

        if (val >= 80)
        {
            grade[0] += 1;
        }
        else if (val >= 70)
        {
            grade[1] += 1;
        }
        else if (val >= 60)
        {
            grade[2] += 1;
        }
        else if (val >= 50)
        {
            grade[3] += 1;
        }
        else
        {
            grade[4] += 1;
        }
    }

    for (int i = 0; i < sizeof(grade)/sizeof(grade[0]); i++){
        printf("%d\n", grade[i]);
    }
}