#include <stdio.h>
#include <string.h>
#include <stdbool.h>
#include <stdlib.h>

void split (char val[]){
    char integerC[20], decimalC[20];
    int split_position = 0;
    bool integer = true;

    for (int i = 0; i < strlen(val) ; i++){
        if(val[i] != '.' && integer == true){
            integerC[i] = val[i];
            split_position++;
        }
        else if (val[i] != '.' && integer == false){
            decimalC[i - split_position] = val[i];
        }
        else {
            integer = false;
            split_position++;
            continue;
            }
    }

    printf("%d %d", atoi(integerC), atoi(decimalC));
}

int main (){
    char a[20], b[20];
    scanf("%s %s", a, b);

    split(a);
}