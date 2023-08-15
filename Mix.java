import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Mix {
    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second){
                     List<T> list = new ArrayList<>();
                     Stream<T> third = Stream.concat(first, second);
                     third.parallel().forEach(s->list.add(s));
                     return list.stream();

    }

}
