package olymp.yandex.training.two.hm5.b;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//TL
public class Solution {

    public static long getSum(int start, int end, List<Long> array) {
        return array.get(end) - array.get(start - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        List<Integer> array;
        List<Long> prefSum = new ArrayList<>();

        n = scanner.nextInt();
        array = Stream.generate(scanner::nextInt).limit(n).collect(Collectors.toList());

        long currentSum = 0;
        prefSum.add(currentSum);
        for (int i = 0; i < n; i++) {
            currentSum = currentSum + array.get(i);
            prefSum.add(currentSum);
        }

        long maxSum = Long.MIN_VALUE;
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                maxSum = Math.max(maxSum, getSum(i, j, prefSum));
            }
        }

        System.out.println(maxSum);
    }
}
