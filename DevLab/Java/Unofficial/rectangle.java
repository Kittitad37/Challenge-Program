import java.util.Scanner;

public class rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int width = sc.nextInt();
        sc.close();
        for(int i = 1; i <= Math.pow(width,2); i++){
            if(i <= width || i % width == 0 || i % width == 1|| i >= Math.pow(width, 2) - width){
                System.out.print("*");
            } else {
                System.out.print(" ");
            }

            if (i % width == 0 && i != 0) {
                System.out.println();
            }
        }
    }
}
