package olymp.yandex.training.two.hm1.c_date;

import java.util.Scanner;

//Wrong Answer
public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int d;
        int m;
        int y;
        int result = 0;

        d = scanner.nextInt();
        m = scanner.nextInt();
        y = scanner.nextInt();

        if (d > 12 || m > 12) {
            result = 1;
        }

        System.out.println(result);
    }
}
