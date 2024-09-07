import java.util.Scanner;

public class mountain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int qty = sc.nextInt();
        int[] height = new int[qty];
        for (int i = 0; i < qty ; i++){
            height[i] = Integer.parseInt(sc.next());
        }
        sc.close();
        for (int order = 0; order < qty; order++){
            for(int left = 0 ; left < height[order]; left++){
                System.out.print("/");
            }
        }
    }
}
