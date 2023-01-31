package olymp.yandex.training.two.hm2.a;

import java.util.Scanner;

//OK
public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x;
        int size = 10_000 + 100;
        int[] arr;
        arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = 0;
        }

        while ((x = scanner.nextInt()) != 0) {
            arr[x]++;
        }

        int indexMax = -1;
        for (int i = size - 1; i >= 0; i--) {
            if (arr[i] != 0) {
                indexMax = i;
                break;
            }
        }

        System.out.println(arr[indexMax]);
    }
}
