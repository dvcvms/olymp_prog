package olymp.yandex.training.two.hm1.d_school_construction;

import java.util.Scanner;

//OK
public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        int x;

        n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            x = scanner.nextInt();
            if (i == (n / 2)) {
                System.out.println(x);
                break;
            }
        }
    }
}
