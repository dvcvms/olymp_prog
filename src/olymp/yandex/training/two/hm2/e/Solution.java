package olymp.yandex.training.two.hm2.e;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

//OK
public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        List<Integer> arr = new ArrayList<>();

        size = scanner.nextInt();
        for (int i = 0; i < size; i++) {
            arr.add(scanner.nextInt());
        }

        Collections.sort(arr);

        int totalTime = 0;
        for (int i = 0; i < (size - 1); i++) {
            totalTime += arr.get(i);
        }

        System.out.println(totalTime);
    }
}
