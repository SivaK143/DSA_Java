package Java8.Hard;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Top3FrequentWords {

    public static void main(String[] args) {

        String paragraph = "Java is great. Java is Object oriented. Java Streams are powerful, and Java is fun";

       Map<String, Long> map = Arrays.stream(
                paragraph.toLowerCase()
                        .replaceAll("[^a-z\\s]", "")
                        .split(" ")
        ).collect(Collectors.groupingBy(
                Function.identity(),
                Collectors.counting()
        ));

       // we need to find in sorted order(descending)
       List<Map.Entry<String, Long>> res = map.entrySet().stream()
                .sorted(Map.Entry.<String, Long>comparingByValue().reversed())
                .limit(3)
                .toList();
        System.out.println(res);

        //find top frequency
       List<Long> topFreq = res.stream()
                .map(Map.Entry::getValue)
                .distinct()
                .limit(3)
                .toList();
        System.out.println(topFreq);

        //we need to print that
       List<Map.Entry<String, Long>> result = res.stream()
                .filter(e->topFreq.contains(e.getValue()))
                .toList();
        System.out.println(result);
    }
}
