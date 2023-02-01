package olymp.yandex.training.two.hm3.c;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

//OK
public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> values;
        List<String> uniqueValues;
        List<String> result;
        String line;

        line = scanner.nextLine();
        values = Arrays.asList(line.split(" "));
        uniqueValues = values.stream().distinct().collect(Collectors.toList());

        result = new ArrayList<>();
        for (String el : uniqueValues) {
            long count = values.stream().filter(x -> x.equals(el)).count();
            if (count == 1) {
                result.add(el);
            }
        }

        result.forEach(i -> System.out.print(i + " "));
    }
}
