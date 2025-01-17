package ExtraTasks;

public class PalindromeNumber {
    // 9. Palindrome Number
    public static void main(String[] args) {
        int x = 321;
        int x2 = -121;
        int x3 = 10;
        int x4 = 0;
        int x5 = 2000000002;
        int x6 = 2111111112;

        System.out.println(isPalindrome(x));
        System.out.println(isPalindrome(x2));
        System.out.println(isPalindrome(x3));
        System.out.println(isPalindrome(x4));
        System.out.println(isPalindrome(x5));
        System.out.println(isPalindrome(x6));
    }

    public static boolean isPalindrome(int x) {
        if (x < 0) return false;

        long reversed = 0;
        long temp = x;

        while (temp != 0) {
            int digit = (int) (temp % 10);
            reversed = reversed * 10 + digit;
            temp /= 10;
        }

        return (reversed == x);
    }
}
