//https://borntodev.com/devlab/task/436

import java.util.Scanner;

public class bottle_cap {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int cap = sc.nextInt();
        sc.close();
        int cap_copy = cap;
        int bonus_cap = 0;
        while (cap_copy >= 3){
            int temp = cap_copy/3;
           bonus_cap += temp;
           cap_copy -= 3*(cap_copy/3);
           cap_copy += temp;
        }
        System.out.println(cap+bonus_cap);
    }
}
