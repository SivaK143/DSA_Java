package Java8.Intermediate;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatingChar {

    public static void main(String[] args) {
        String s = "swiss";
       Map<Character, Long> map = s.chars().mapToObj(c-> (char)c)
                .collect(Collectors.groupingBy(Function.identity(),
                        LinkedHashMap::new,
                        Collectors.counting()));

     Optional<Map.Entry<Character,Long>> res = map.entrySet()
               .stream()
               .filter(c->c.getValue()==1)
               .findFirst();

        System.out.println(res);
    }
}
