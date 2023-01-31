package olymp.yandex.training.two.hm2.c;

import java.util.Scanner;

//OK
public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String palindrome;
        int countChanges;

        palindrome = scanner.next();
        countChanges = 0;

        int palindromeLength = palindrome.length();
        for (int i = 0; i < palindromeLength / 2; i++) {
            if (palindrome.charAt(i) != palindrome.charAt(palindromeLength - i - 1)) {
                countChanges++;
            }
        }

        System.out.println(countChanges);
    }
}
