import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Mix {
    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second){
        List<T> list = new ArrayList<>();
        Iterator<T> firstIterator = first.iterator();
        Iterator<T> secondIterator = second.iterator();
        while (firstIterator.hasNext() && secondIterator.hasNext()) {
            list.add(firstIterator.next());
            list.add(secondIterator.next());
        }
        Collections.shuffle(list);
        return list.stream();
    }
    }


