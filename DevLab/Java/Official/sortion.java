//https://borntodev.com/devlab/task/216

import java.util.Scanner;

public class sortion {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Scanner text = new Scanner(System.in);
        int val = sc.nextInt();
        int amount = sc.nextInt();
        String ans = "";
        for (int i = 1; i <= amount; i++){
            String raw = text.nextLine();
            String splited[] = raw.split(" ");
            if (val >= Integer.parseInt(splited[0]) && val <= Integer.parseInt(splited[1])){
                ans = splited[2];
            }
        }
        sc.close();
        text.close();
        System.out.println(ans);
    }
}
