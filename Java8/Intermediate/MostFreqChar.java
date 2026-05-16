package Java8.Intermediate;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MostFreqChar {

    public static void main(String[] args) {
        String input = "banana";
       Map<Character,Long> map = input.chars().mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
      Map.Entry<Character,Long> res = map.entrySet().stream()
               .max(Map.Entry.comparingByValue())
               .orElseThrow();
        System.out.println(res);
    }
}
