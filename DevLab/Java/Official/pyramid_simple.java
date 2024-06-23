//https://borntodev.com/devlab/task/25

import java.util.Scanner;

public class pyramid_simple {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int val = sc.nextInt();
        sc.close();
        for (int i = 1; i <= val ; i++){
            for (int j = 0 ; j < i; j++){
            System.out.print("*");
            }
            System.out.println();
        }
    }
}
