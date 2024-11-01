//https://www.borntodev.com/devlab/task/642

import java.util.Scanner;

public class secret_code {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuffer ans = new StringBuffer();

        String val = sc.nextLine();
        sc.close();

        for (char c : val.toCharArray()){
            ans.append(((int) c) - 96);
        }
        System.out.println(ans);
    }
}
