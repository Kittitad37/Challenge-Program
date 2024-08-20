//https://borntodev.com/devlab/task/551

import java.util.Scanner;

public class number1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        sc.close();

        long sum = 0;
        for (char c : input.toCharArray()) {
            int char_val = (int) c;
            long powered_val = (long) Math.pow(char_val, input.length());
            sum += powered_val;
        }

        while(sum >= 10){
            sum = final_sum(sum);
        }
        
        System.out.println(sum);
    }
    static long final_sum(long num) {
        long sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
