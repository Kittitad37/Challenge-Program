#include <stdio.h>
#include <string.h>

int main()
{
    char val[] = "";
    scanf("%s", val);
    for (int i = 0; i < strlen(val); i++){
        printf("%c ", val[i]);
    }
    return 0;
}