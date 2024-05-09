//https://borntodev.com/devlab/task/219

import java.util.Scanner;

public class capslock {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        for (char c : input.toCharArray()) {
            char val;
            if (Character.isUpperCase(c)) {
                val = Character.toLowerCase(c);
            } else if (Character.isLowerCase(c)) {
                val = Character.toUpperCase(c);
            } else {
                val = c;
            }
            System.out.print(val);
        }

        sc.close();
    }
}
