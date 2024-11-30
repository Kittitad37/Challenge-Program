//https://www.borntodev.com/devlab/task/1041

import java.util.Scanner;

public class secret_sentence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        sc.close();
        StringBuilder val = new StringBuilder();
        int len_withoutsp = (input.replaceAll("\\s", "")).length();
        for (int i = 0 ; i < input.length() ; i++){
            char[] j = input.toCharArray();
            if (j[i] == ' ') {
                val.append(" ");
            } else {
                char finalChar = (char)(Integer.valueOf(j[i]) + (len_withoutsp));
                len_withoutsp--;
                val.append(finalChar);
            }
        }
        System.out.println(val);
    }
}
