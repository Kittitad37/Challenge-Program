//https://www.borntodev.com/devlab/task/4

import java.util.Scanner;

public class pyramid3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        sc.close();
        for (int line = 1; line <= input; line++) {
            for (int i = 0; i < input - line; i++) {
                System.out.print(" ");

            }
            for (int j = 0; j < 1 + (2 * (line - 1)); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = input - 1 ; i > 0; i--) {
            for (int j = 0; j < input - i ; j++){
                System.out.print(" ");
            }
            for (int k = 0 ; k < 1 + (2 * (i - 1)) ; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}