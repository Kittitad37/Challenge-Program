#include <stdio.h>
#include <string.h>'

int main(){
    int amount;
    scanf("%d", &amount);
    char height[amount];
    int max = 0;
    for (int i = 0; i < amount; ++i){
        scanf("%d", &height[i]);
        if (height[i] >= max)
            max = height[i];
    }
    for (int i = 0; i < sizeof(arr)/sizeof(arr[0]) - 1; i++)
    { // Exclude the null terminator
        printf("%c ", arr[i]);
    }
    // for (int line =  ; line > 0 ; line--){

    // }
}