//https://borntodev.com/devlab/task/226

import java.util.ArrayList;
import java.util.Scanner;

public class find_position {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<Integer>();
        while(arr.size() < amount){
            arr.add(sc.nextInt());
        }
        int finding = sc.nextInt();
        sc.close();
        ArrayList<Integer> index = new ArrayList<Integer>();
        for (int i = 0 ; i < arr.size() ; i++){
            if(arr.get(i) == finding){
                index.add(i+1);
            }
        }
        System.out.print("Position: ");
        for (int i = 0; i < index.size() ; i++){
            System.out.print(index.get(i));
            if(i != index.size()-1){
                System.out.print(",");
            }
        }
    }
}
