package olymp.yandex.training.two.hm3.d;

import java.util.*;
import java.util.stream.IntStream;

//OK
public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        String line;
        Set<String> uniqueValuesOfResult = new HashSet<>();

        size = scanner.nextInt();
        IntStream.range(1, size + 1).forEach(x -> uniqueValuesOfResult.add(Integer.toString(x)));

        Set<String> answer = new HashSet<>();
        while (!(line = scanner.nextLine()).equals("HELP")) {
            switch (line) {
                case "YES" -> uniqueValuesOfResult.retainAll(answer);
                case "NO" -> uniqueValuesOfResult.removeAll(answer);
                default -> {
                    answer.clear();
                    Arrays.stream(line.split(" ")).forEach(x -> answer.add(x));
                }
            }
        }

        List<Integer> result = new ArrayList<>();
        uniqueValuesOfResult.forEach(x -> result.add(Integer.parseInt(x)));
        Collections.sort(result);
        result.forEach(x -> System.out.print(x + " "));
    }
}
