//https://www.borntodev.com/devlab/task/220

import java.util.Scanner;

public class repeater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] splited = input.split("");
        sc.close();
        for (int i = 0; i <= splited.length - 1; i++) {
            for (int j = splited.length - 1; j >= 0; j--) {
                if (j > i) {
                    System.out.print("  ");
                } else {
                    System.out.print(splited[j] + " ");
                }
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(splited[k] + " ");
            }
            System.out.println();
        }
    }
}
