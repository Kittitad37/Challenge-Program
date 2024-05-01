import java.util.Scanner;

public class find_num {
    static String ans = "No";
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String amount = sc.nextLine();
        String val = sc.nextLine();
        String finding = sc.nextLine();
        String[] splited = val.split(" ");
        for (int i = 0 ; i <= splited.length - 1 ; i++){
            if(finding.equals(splited[i])){
                ans = "Yes";
            }
        }
        sc.close();
        System.out.println(ans);
    }
}
