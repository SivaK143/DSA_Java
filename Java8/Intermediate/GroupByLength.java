package Java8.Intermediate;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByLength {

    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple","bat", "banana","cat","ball","goat");
       Map<Integer, List<String>> output = words.stream()
                .collect(Collectors.groupingBy(String::length));
    }
}
