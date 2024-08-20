//https://borntodev.com/devlab/task/33

import java.util.Scanner;

public class leap_year {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        sc.close();
        if (year % 100 == 0 && year % 400 != 0) {
            System.out.println("Not a Leap Year");
        } else {
            if (year % 4 == 0) {
                System.out.println("Leap Year");
            } else {
                System.out.println("Not a Leap Year");
            }
        }
    }
}
