#include <stdio.h>

int main(){
    int qty;
    scanf("%d", &qty);
    int val[qty];
    scanf("%d", &val[0]);
    int min = val[0], max = val[0];
    for (int i = 1 ; i < qty ; i++){
        scanf("%d", &val[i]);
        if(val[i] < min){
            min = val[i];
        }
        if(val[i] > max){
            max = val[i];
        }
    }
    printf("%d", min*max);
}