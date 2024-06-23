//https://borntodev.com/devlab/task/211

import java.util.Scanner;

public class sum_and_sum {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        sc.close();
        long first_sum = 0;
        for (char c : String.valueOf(input).toCharArray()) {
            first_sum += Character.getNumericValue(c);
        }
        long ans = 0;
        for (char c2 : String.valueOf(first_sum).toCharArray()) {
            ans += Character.getNumericValue(c2);
        }
        if(ans >= 10){
            int final_ans = 0;
            for (char c3 : String.valueOf(ans).toCharArray()) {
                final_ans += Character.getNumericValue(c3);
            }
            System.out.println(final_ans);
        } else {
            System.out.println(ans);
        }
    }
}
