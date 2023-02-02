package olymp.yandex.training.two.hm4.b;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

//OK
public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> map = new TreeMap<>();

        while (scanner.hasNext()) {
            String key = scanner.next();
            int value = scanner.nextInt();

            map.merge(key, value, Integer::sum);
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
