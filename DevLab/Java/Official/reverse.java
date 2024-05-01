import java.util.Scanner;

public class reverse {
	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String input = sc.nextLine();
      String[] splited = input.split("");
      for (int i = splited.length - 1 ; i >= 0 ; i--){
        System.out.print(splited[i]);
      }
      sc.close();
	}
}