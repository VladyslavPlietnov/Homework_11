import java.util.ArrayList;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class LIstOfNames {
    public static void printOdd(String... list){

            System.out.println(IntStream.range(0, list.length)
                    .filter(i -> i % 2 != 0)
                    .mapToObj(i -> i + ". " + list[i])
                    .collect(Collectors.joining(", ")));

    }

    public static void sortReverse(String... list) {
        Stream.of(list)
                .map(String::toUpperCase)
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);
    }
    public static String remake(String[] strings){
        return Arrays.stream(strings)
                .flatMap(n -> Arrays.stream(n.split(",")))
                .sorted()
                .collect(Collectors.joining(", "));
    }
}
