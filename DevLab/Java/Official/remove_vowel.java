import java.util.ArrayList;
import java.util.Scanner;

public class remove_vowel {
    public static void main(String[] args){
        char vowel[] = {'A', 'a', 'E', 'e', 'I', 'i', 'O', 'o', 'U', 'u'};
        ArrayList<Character> lista = new ArrayList<Character>();
        
        for (int i = 0; i < vowel.length ; i++){
            lista.add(vowel[i]);
        }
        Scanner sc = new Scanner(System.in);
        String val = sc.nextLine();
        sc.close();

        StringBuilder str = new StringBuilder();

         for (char c : val.toCharArray()) {
            if(!lista.contains(c)){
                str.append(c);
            }
        }
        System.out.println(str.toString());
    }
}
