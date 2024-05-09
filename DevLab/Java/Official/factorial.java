//https://borntodev.com/devlab/task/210

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long input = sc.nextInt();
        sc.close();
        if(input == 0){
            input = 1;
        }
        for (long i = input - 1 ; i >= 1 ; i--){
            input *= i;
        }
        System.out.println(input);
    }
}
