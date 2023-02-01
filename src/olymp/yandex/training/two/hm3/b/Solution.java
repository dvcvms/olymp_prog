package olymp.yandex.training.two.hm3.b;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

//OK
public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Integer> set = new HashSet<>();

        while (scanner.hasNext()) {
            int value = scanner.nextInt();
            System.out.println(set.contains(value) ? "YES" : "NO");
            set.add(value);
        }
    }
}
