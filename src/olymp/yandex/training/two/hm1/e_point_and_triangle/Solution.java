package olymp.yandex.training.two.hm1.e_point_and_triangle;

import java.util.Scanner;

//OK
public class Solution {
    public static double distance(int x1, int y1, int x2, int y2) {
        double d;
        d = Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
        return d;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int d;
        int x;
        int y;

        d = scanner.nextInt();
        x = scanner.nextInt();
        y = scanner.nextInt();

        // y = -x + d; : y <= -x + 4;
        if ((x >= 0) && (y >= 0) && (y <= -x + d)) {
            System.out.println(0);
        } else {
            double ax;
            double bx;
            double cx;

            ax = distance(x, y, 0, 0);
            bx = distance(x, y, d, 0);
            cx = distance(x, y, 0, d);

            if (ax <= bx) {
                if (ax <= cx) {
                    System.out.println(1);
                } else {
                    System.out.println(3);
                }
            } else {
                if (bx <= cx) {
                    System.out.println(2);
                } else {
                    System.out.println(3);
                }
            }
        }
    }
}
