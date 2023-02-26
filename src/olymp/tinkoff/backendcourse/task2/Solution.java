package olymp.tinkoff.backendcourse.task2;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        n = scanner.nextInt();

        int totalSum = 0;
        int start = Integer.MIN_VALUE;
        int end = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            String t1;
            String t2;

            t1 = scanner.next();
            t2 = scanner.next();

            totalSum += Integer.parseInt(t1);

            if (t2.equals("-")) {
                end = Math.min(end, -totalSum);
            } else {
                start = Math.max(start, -totalSum);
            }
        }
        System.out.println(end == Integer.MAX_VALUE ? "inf" : totalSum + end - 1);
    }
}