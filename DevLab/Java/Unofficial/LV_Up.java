//https://www.borntodev.com/devlab/task/483

import java.util.Scanner;

public class LV_Up {
    static Integer level = 1;
    static Integer exp = 0;
    static Integer exp_max = level * 100;
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] val = input.split(" ");
        exp = Integer.parseInt(val[1]);
        sc.close();
        while(exp >= exp_max){
            exp -= exp_max;
            level++;
            exp_max = level * 100;
        }
        data();
    }

    static void data(){
        int atk = level * 10;
        int hp = level * 100;

        System.out.println("Lv : " + level);
        System.out.println("Exp : " + exp + "/" + exp_max);
        System.out.println("ATK : " + atk);
        System.out.println("HP : " + hp);
    }
}
