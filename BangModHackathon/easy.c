#include <stdio.h>

int main (){
    int qty;
    scanf("%d", &qty);
    float val = 0, temp;
    for (int i = 0; i < qty; i++){
        scanf("%f", &temp);
        val += temp;
    }
    printf("%.2f", val/qty);
}