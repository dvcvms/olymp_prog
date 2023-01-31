package olymp.yandex.training.two.hm2.e;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//OK
public class SolutionUsingStreams {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        List<Integer> arr;

        size = scanner.nextInt();
        arr = Stream.generate(scanner::nextInt).limit(size).collect(Collectors.toList());
        Collections.sort(arr);

        int totalTime;
        totalTime = arr.stream().reduce(Integer::sum).get() - arr.get(size - 1);
//        totalTime = arr.stream().limit(size-1).reduce(Integer::sum).get();
        System.out.println(totalTime);
    }
}
