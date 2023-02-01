package olymp.yandex.training.two.hm4.a;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;


//OK
public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        Map<Long, Long> map = new TreeMap<>();

        n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            long x;
            long y;

            x = scanner.nextLong();
            y = scanner.nextLong();

            map.merge(x, y, Long::sum);
        }

        for (Map.Entry<Long, Long> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
