//https://leetcode.com/problems/palindrome-number/

public class palindrome {
    static public boolean isPalindrome(int x) {
        String val = String.valueOf(x);
        int n = val.length();
        for (int i = 0 ; i < n/2 ; i++) {
            if (val.toCharArray()[i] != val.toCharArray()[n-i-1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int x = 121;
        System.out.println(isPalindrome(x));
    }
}
