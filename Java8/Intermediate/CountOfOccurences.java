package Java8.Intermediate;

import java.lang.reflect.MalformedParameterizedTypeException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountOfOccurences {

    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple","apple", "orange","banana","orange","banana");
       Map<String, Long> map = words.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(map);
    }
}
