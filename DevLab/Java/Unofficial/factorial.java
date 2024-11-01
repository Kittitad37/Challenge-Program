//https://www.borntodev.com/devlab/task/640

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String val = sc.nextLine();
        sc.close();

        int num = Integer.parseInt(val.replace("[", "").replace("]", ""));
        System.out.printf("%d!:%d", num, fac(num));
    }

    static int fac (int val){
        int ans = 1;
        for(int i = val ;  i > 0 ; i--){
            ans *= i;
        }
        return ans;
    }
}
