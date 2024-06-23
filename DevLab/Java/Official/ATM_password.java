//https://borntodev.com/devlab/task/223

import java.util.Scanner;

public class ATM_password {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        sc.close();

        int sum = 0;
        StringBuilder number = new StringBuilder();

        for (char c : input.toCharArray()) {
            if (Character.isDigit(c)) {
                number.append(c);
            } else {
                if (number.length() > 0) {
                    sum += Integer.parseInt(number.toString());
                    number.setLength(0);
                }
            }
        }
        if(number.length() > 0){
            sum += Integer.parseInt(number.toString());
        }

        if(String.valueOf(sum).split("").length < 4){
            StringBuilder val = new StringBuilder();
            for (char c : String.valueOf(sum).toCharArray()){
                val.append(String.valueOf(c));
            }
            while(val.length() < 4){
                val.insert(0, "0");
            }
            
            System.out.println(val.toString());

        } else {
            System.out.println(sum);
        }
    }
}
