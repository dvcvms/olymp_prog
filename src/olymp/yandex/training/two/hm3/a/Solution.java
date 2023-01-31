package olymp.yandex.training.two.hm3.a;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

//OK
public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Integer> first = new HashSet<>();
        Set<Integer> second = new HashSet<>();
        String firstLine;
        String secondLine;

        firstLine = scanner.nextLine();
        secondLine = scanner.nextLine();

        int[] firstArr = Arrays.stream(firstLine.split(" ")).mapToInt(Integer::valueOf).toArray();
        int[] secondArr = Arrays.stream(secondLine.split(" ")).mapToInt(Integer::valueOf).toArray();

        Arrays.stream(firstArr).forEach(first::add);
        Arrays.stream(secondArr).forEach(second::add);

        first.retainAll(second);
        System.out.println(first.size());
    }
}
