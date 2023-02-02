package olymp.yandex.training.two.hm5.a;

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
        int q;
        List<Integer> array;
        List<Long> prefixSum = new ArrayList<>();

        n = scanner.nextInt();
        q = scanner.nextInt();

        array = Stream.generate(scanner::nextInt).limit(n).collect(Collectors.toList());

        long currentSum = 0;
        prefixSum.add(currentSum);
        for (int i = 0; i < n; i++) {
            currentSum = currentSum + array.get(i);
            prefixSum.add(currentSum);
        }

        for (int i = 0; i < q; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            System.out.print(getSum(a, b, prefixSum));
            if (i != (q - 1)) {
                System.out.println();
            }
        }
    }
}
