//https://www.borntodev.com/devlab/task/345

import java.util.Scanner;

public class uppercase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String val = sc.nextLine();
        sc.close();
        String[] lst = val.split("");
        StringBuffer ans = new StringBuffer();

        for (int i = 1 ; i <= val.length() ; i++){
            if (i % 2 == 0) {
                ans.append(lst[i-1].toUpperCase());
            } else {
                ans.append(lst[i-1].toLowerCase());
            }
        }
        System.out.println(ans);
    }
}
