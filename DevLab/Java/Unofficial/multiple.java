//https://www.borntodev.com/devlab/task/890

import java.util.Scanner;

public class multiple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String first = sc.nextLine();
        String end = sc.nextLine();
        sc.close();
        if ("".equals(end)) {
            end = "12";
        }
        try {
           double firstnum = Double.parseDouble(first);
           double endnum  = Double.parseDouble(end);

           for (int i = 1 ; i <= endnum ; i++){
            if (first.contains(".")){
                print(firstnum, i, true);
            } else {
                print(firstnum, i, false);
            }
           }

        } catch (NumberFormatException e) {
            System.out.println("error input");
        }
    }

    static void print(double first, int multiply, boolean decimal){
        if (decimal == true){
            System.out.println(first + "x" + multiply + " = " + ans_check(first*multiply));
        } else {
            System.out.println((int)first + "x" + multiply + " = " + ((int)first)*multiply);
        }
    }

    static String ans_check (double val){
        int val_int = (int) val;
        double val_decimal = val - val_int;

        if (val_int - val_decimal == val_int) {
            return String.valueOf(val_int);
        } else{
            return String.format("%.2f", val);
        }
    }
}
