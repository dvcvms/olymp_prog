package olymp.leetcode.easy.PalindromeNumber;

class SolutionUsingString {
    public static boolean isPalindrome(int x) {
        String digit = Integer.toString(x);
        for (int i = 0; i < digit.length() / 2; i++) {
            if (digit.charAt(i) != digit.charAt(digit.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(12));
    }
}
