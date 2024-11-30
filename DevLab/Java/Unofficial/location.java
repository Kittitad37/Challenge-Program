//https://www.borntodev.com/devlab/task/644

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Stream;

public class location {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String raw_position = sc.nextLine();
        int[] postition = Stream.of(raw_position.substring(1, raw_position.length()-1).split(",")).mapToInt(Integer::parseInt).toArray();
        ArrayList<String> lst = new ArrayList<>();
        while (true){
            String val = sc.nextLine();
            if("END".equals(val)){
                break;
            } else {
                lst.add(val);
            }
        }
        sc.close();
        int heading = 0;
        /* 
          0
        3   1
          2
        */
        for (String i : lst){
            heading = heading_set(heading);
            switch (i) {
                case "FW" -> {
                    straight(postition, heading, true);
                }
                case "BK" -> {
                    straight(postition, heading, false);
                }
                case "L" -> {
                    heading = heading - 1;
                    straight(postition, heading, true);
                }
                case "R" -> {
                    heading = heading + 1;
                    straight(postition, heading, true);
                }
            }
        }
        System.out.printf("(%d,%d)" ,postition[0],postition[1]);
    }

    static int heading_set(int heading){
        if (heading == -1) {
            return 3;
        } else {
            return heading % 4;
        }
    }

    static void straight(int[] postition, int heading, boolean fw){
        int i = 1;
        if (fw == false) {
            i = -1;
        }
        switch (heading) {
            case 0 -> {
                postition[1] = postition[1]+i;
            }
            case 1 -> {
                postition[0] = postition[0]+i;
            }
            case 2 -> {
                postition[1] = postition[1]-i;
            }
            case 3 -> {
                postition[0] = postition[0]-i;
            }
        }
    }
}
