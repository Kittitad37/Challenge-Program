//https://borntodev.com/devlab/task/338

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] arge){
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        sc.close();

        if(input % 3 == 0 && input % 2 == 0){
            System.out.println("FizzBuzz");
        } else if (input % 3 == 0){
            System.out.println("Fizz");
        } else if (input % 2 == 0) {
            System.out.println("Buzz");
        }
    }
}
