//https://borntodev.com/devlab/task/15

import java.util.Scanner;

public class sommai_cal {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int price = sc.nextInt();
        int amount = sc.nextInt();
        sc.close();

        System.out.println(price*amount);
    }
}
