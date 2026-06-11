package practice1;
import java.util.Scanner;

public class Palindrome {
    static boolean isPalindrome(String s) {
        int l = 0;

        for(int r = s.length() - 1; l < r; --r) {
            if (s.charAt(l) != s.charAt(r)) {
                return false;
            }

            ++l;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(isPalindrome(s));
    }
}
