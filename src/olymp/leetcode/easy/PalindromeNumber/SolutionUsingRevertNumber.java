package olymp.leetcode.easy.PalindromeNumber;

public class SolutionUsingRevertNumber {

    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        int copyX = x;
        int revertedX = 0;
        while (copyX > 0) {
            revertedX = revertedX * 10 + copyX % 10;
            copyX = copyX / 10;
        }

        return x == revertedX;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(123454321));
        System.out.println(isPalindrome(123421));
        System.out.println(isPalindrome(1523412123));
    }
}
