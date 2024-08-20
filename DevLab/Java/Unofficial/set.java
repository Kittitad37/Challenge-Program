//https://borntodev.com/devlab/task/693
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class set {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arrl = new ArrayList<>();
        for(int i = 0; i < 6; i++){
            int val = sc.nextInt();
            if(arrl.contains(val) == false){
                arrl.add(val);
            }
        }
        sc.close();
        Collections.sort(arrl);
        System.out.println(arrl);
    }
}
