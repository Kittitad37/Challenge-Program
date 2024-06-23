//https://borntodev.com/devlab/task/212

import java.util.Scanner;

public class password_creation {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        String password = sc.nextLine();
        sc.close();

        Integer charac = 0;
        Integer upper = 0;
        Integer lower = 0;
        Integer num = 0;
        Integer symbol = 0;
        Integer len = 0;

        for (char c : password.toCharArray()) {
            len++;
            if(Character.isAlphabetic(c)){
                charac++;
                if(Character.isUpperCase(c)){
                    upper++;
                }
                if (Character.isLowerCase(c)) {
                    lower++;
                }
            } else if (Character.isDigit(c)){
                num++;
            } else if (!Character.isLetterOrDigit(c)){
                symbol++;
            }
        }
        if(charac >= 3 && charac <= 20 && upper > 0 && lower > 0 && num > 0 && symbol > 0 && len <= 40){
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }
    }
}