//https://leetcode.com/problems/string-to-integer-atoi/

public class atoi {

    public static void main(String[] args) {
        String s = " ";
        System.out.println(myAtoi(s));
    }

    static public int myAtoi(String s) {
        int i = 0, n = s.length();
        StringBuilder val = new StringBuilder();
        boolean isNegative = false;
        if(n == 0){
            return 0;
        }
        while (i < n && s.charAt(i) == ' ') {
            i++;
        }

        if (i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
            isNegative = (s.charAt(i) == '-');
            i++;
        }

        myBreakLabel: while (i < n) {
                switch (s.charAt(i)) {
                    case '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' -> {
                        val.append(s.charAt(i));
                    }
                    default -> {
                        {
                           break myBreakLabel;
                        }
                    }
                }
                i++;
        }
        try{
            return val.length() == 0 ? 0 : Integer.parseInt( isNegative ? "-" + String.valueOf(val): String.valueOf(val));
        } catch (NumberFormatException e){
            return isNegative ? Integer.MIN_VALUE : Integer.MAX_VALUE;
        }
    }
}
