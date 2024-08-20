//https://borntodev.com/devlab/task/31

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class reverse_print {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<Integer>();
        int amount = sc.nextInt();
        for (int i = 0 ; i < amount ; i++){
            int val = sc.nextInt();
            lista.add(val);
        }
        sc.close();
        Collections.reverse(lista);
        for (int c : lista) {
            System.out.println(c);
        }
    }
}
