//https://www.borntodev.com/devlab/task/826

import java.util.Scanner;

public class ball {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        double height = Double.parseDouble(input.substring(0, input.length()));
        sc.close();
        double ans = height;
        while (height > 0.00001) {
            height = 0.8 * height;
            ans += height * 2;
        }
        System.out.printf("%dm", Math.round(ans));
    }
}
