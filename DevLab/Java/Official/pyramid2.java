//https://borntodev.com/devlab/task/3

import java.util.Scanner;

public class pyramid2 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        sc.close();

        for (int line = 0; line < input ; line++){
            for (int k = 1; k < input - line ; k++){
                System.out.print(" ");
            }
            for (int j = 0; j < 1 + (2*line) ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
