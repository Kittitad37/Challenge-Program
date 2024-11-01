//https://www.borntodev.com/devlab/task/607

import java.util.Scanner;

public class add_bracket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String val = sc.nextLine();
        sc.close();
        StringBuffer ans = new StringBuffer();
        for (char c : val.toCharArray()){
            if (c == '.'){
                ans.append("[.]");
            } else {
                ans.append(c);
            }
        }
        System.out.println(ans);
    }
}
