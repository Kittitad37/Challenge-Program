//https://borntodev.com/devlab/task/358

import java.util.Scanner;

public class recursive {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        sc.close();
        if(input < 0){
            System.out.println(-1);
        } else {
            System.out.println(_recursive(input));
        }
    }
    static int _recursive (int val){
        if(val == 0 ){
            return 1;
        } else {
            return _recursive(val-1)+100;
        }
    }
}
