//https://www.borntodev.com/devlab/task/2

import java.util.Scanner;

public class pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        for (int i = 1; i <= input; i++) {
            for (int j = 1; j <= i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}