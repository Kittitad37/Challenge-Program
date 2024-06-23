//https://borntodev.com/devlab/task/26

import java.util.Scanner;

public class triangle {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        sc.close();

        for (int line = 1 ; line <= input ; line++){
            for (int i = 0 ; i < input - line ; i++){
                    System.out.print(" ");
                
            }
            for (int j = 0; j < 1 + (2 * (line - 1)); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
