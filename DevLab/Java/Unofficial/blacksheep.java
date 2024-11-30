//https://www.borntodev.com/devlab/task/913

import java.util.Scanner;
import java.util.stream.Stream;

public class blacksheep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        sc.close();
        String input_trim = input.substring(1, input.length()-1);
        int[] arr =  Stream.of(input_trim.split(",")).mapToInt(Integer::parseInt).toArray();
        int[] lst = {0,0};
        if (arr.length % 2 == 0) {
            System.out.println(0);
        }
        else {
            for (int i = 0 ; i < arr.length ; i++){
                if(arr[i] == arr[0]){
                   lst[0] = lst[0] + i + 1;
                } else {
                    lst[1] = lst[1] + i + 1;
                }
            }

        if(lst[0] == 0 || lst[1] == 0){
            System.out.println(0);
        } else if (lst[1] < lst[0]){
            System.out.println(arr[lst[1] - 1]);
        } else if (lst[1] > lst[0]){
            System.out.println(arr[lst[0] - 1]);
        }
    }
    }
}
