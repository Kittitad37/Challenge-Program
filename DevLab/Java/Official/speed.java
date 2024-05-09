//https://borntodev.com/devlab/task/13

import java.util.Scanner;

public class speed {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int t = sc.nextInt();
        sc.close();
        System.out.println(s/t + " km/h");
    }
}
