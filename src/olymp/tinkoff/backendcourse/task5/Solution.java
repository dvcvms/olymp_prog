package olymp.tinkoff.backendcourse.task5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        List<Integer> arr = new ArrayList<>();

        n = scanner.nextInt();
        Stream.generate(scanner::nextInt).limit(n).forEach(arr::add);
        Collections.sort(arr);

        long maxSum = -1;
        for (int i = 0; i < n; i++) {
            long currentSum = 0;
            int current = arr.get(i);
            for (int j = i; j < n; j++) {
                currentSum += arr.get(j) / current;
            }
            currentSum *= current;
            maxSum = Math.max(currentSum, maxSum);
        }

        System.out.println(maxSum);
    }
}