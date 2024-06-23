//https://borntodev.com/devlab/task/334

import java.util.Scanner;

public class longer {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        String first = sc.nextLine();
        String second = sc.nextLine();
        sc.close();

        int len[] = {first.length(), second.length()};

        if(len[0] > len[1]){
            System.out.println(len[0] + "\n" + len[1]);
        } else {
            System.out.println(len[1] + "\n" + len[0]);
        }
    }
}
