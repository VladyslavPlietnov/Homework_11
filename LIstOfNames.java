import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class LIstOfNames {
    public static void printOdd(String... list){
        ArrayList<String> names = new ArrayList<>();
        Stream.of(list)
                .forEach(s -> names.add(s));
        //System.out.println(names.toString());
        names.stream()
                .map(s-> names.indexOf(s)+1 + "." + s)
                .filter(s -> Integer.parseInt(String.valueOf(s.charAt(0)))%2 !=0)
                .forEach(System.out::println);
    }

    public static void sortReverse(String... list){
        Stream.of(list)
                .sorted((s1,s2)->s2.compareTo(s1))
                .forEach(System.out::println);

    }
    public static String remake(String[] strings){
      String string = Stream.of(strings)
              .reduce("",(s1,s2)-> {
                  //System.out.println(s1 + "," + s2);
                  return s1.concat("," + s2);
              });
        System.out.println(string);
        String[] newStrings = string.split(",");

      String result = Stream.of(newStrings)
              .filter(s-> !s.equals(""))
              .sorted()
              .reduce("", (s1,s2) -> s1+ ","+ s2);
      return result.substring(1,result.length());
    }
}
