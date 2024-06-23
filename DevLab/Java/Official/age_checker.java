//https://borntodev.com/devlab/task/21

import java.util.Scanner;

public class age_checker {
    public static void main(String[] args){
        Scanner num = new Scanner(System.in);
        Scanner str = new Scanner(System.in);

        String name = str.nextLine();
        int age = num.nextInt();
        num.close();
        str.close();

        if(age - 2021 >= 18 || name.equals("A A")){
            System.out.printf("Welcome %s to NongGipsy Pub", name);
        } else {
            System.out.print("You shall not pass!");
        }
    }
}
