package olymp.yandex.training.two.hm1.b_metro_line;

import java.util.Scanner;

//OK
public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n;
        int i;
        int j;
        int result;

        n = scanner.nextInt();
        i = scanner.nextInt();
        j = scanner.nextInt();

        result = Math.min(Math.abs(j - i) - 1, (n - 1) - Math.abs(j - i));

        System.out.println(result);
    }
}
