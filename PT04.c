#include <stdio.h>

int main(){
    int jom = 0;
    int amount = 242;
    printf("Example : 1 = Mon 7 = Sun\n");
    printf("Enter today : ");
    scanf("%d", &jom);
    const char *day[] = {"", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
    printf("%s\n",day[(jom + (amount % jom)) % 7]);
}