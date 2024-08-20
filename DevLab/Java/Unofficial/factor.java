//https://borntodev.com/devlab/task/429

import java.util.ArrayList;
import java.util.Scanner;

public class factor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int val = sc.nextInt();
        ArrayList<String> arr = new ArrayList<String>();

        sc.close();

        for (int i = 1; i <= val; i++){
            if(val % i == 0){
                arr.add(String.valueOf(i));
            }
        }

        System.out.println(arr.size() + " : " + String.join(",", arr));
    }
}
