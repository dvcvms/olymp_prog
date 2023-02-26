package olymp.tinkoff.backendcourse.task1;

import java.util.Scanner;

public class Solution {
    public static int charToInt(char c) {
        return ((int) c - 48);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String message = scanner.nextLine();

        for (int i = 0; i <= message.length() - 10; i++) {
            int[] arrayFrequency = new int[10];
            boolean flag = true;
            for (int j = 0; j < 10; j++) {
                if (message.charAt(i + j) != '?') {
                    int frequency = arrayFrequency[charToInt(message.charAt(i + j))] += 1;
                    if (frequency > 1) {
                        flag = false;
                        break;
                    }
                }
            }
            if (flag) {
                System.out.print("YES");
                return;
            }
        }
        System.out.print("NO");
    }
}