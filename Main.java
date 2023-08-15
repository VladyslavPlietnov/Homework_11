import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Main {
    public static void main(String[] args) {
        LIstOfNames.printOdd("Vlad", "Igor", "Sasha", "Masha", "Valya");
        LIstOfNames.sortReverse("Vlad", "Igor", "Sasha", "Masha", "Valya");
        String[] strings = {"1,2,0", "4,5"};
        System.out.println(LIstOfNames.remake(strings));
        Random random = new Random();
        random.seed(11);
        for(int i =0; i<10; i++){
            System.out.println(random.next());
        }
        Stream.iterate(11, seed -> random.seed(seed).next()).limit(10).forEach(System.out::println);
        Stream<Integer> first = Stream.of(1,2,3,4,5);
        Stream<Integer> second = Stream.of(6,7,8,9);
        Mix.zip(first,second).forEach(System.out::println);
    }
}