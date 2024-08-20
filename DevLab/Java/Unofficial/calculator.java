//https://borntodev.com/devlab/task/617

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double number1 = sc.nextDouble();
        String operator = sc.next();
        double number2 = sc.nextDouble();
        sc.close();
        double ans = 0;
        switch (operator){
            case "+" :
                ans = number1 + number2;
                break;
            case "-" :
                ans = number1 - number2;
                break;
            case "*":
                ans = number1 * number2;
                break;
            case "/":
                ans = number1 / number2;
                System.out.println((int)number1 + " " + operator + " " + (int)number2 + " = " + ans);
                return;
        }
        System.out.println((int)number1 + " " + operator + " " + (int)number2 + " = " + (int)ans);
    }
}
