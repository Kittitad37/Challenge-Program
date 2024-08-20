//https://borntodev.com/devlab/task/534

import java.util.Scanner;

public class stair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int step = sc.nextInt();
        sc.close();

        for (int line = 0; line <= step; line++){
            for(int space = 0 ; space < 3 * (step - line) ; space++){
                System.out.print(" ");
            }
            if(line == 0){
                System.out.println("__");
            } else {
                System.out.println("__|");
            }
        }
    }
}
