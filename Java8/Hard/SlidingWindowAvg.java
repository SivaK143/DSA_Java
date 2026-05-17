package Java8.Hard;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class SlidingWindowAvg {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(4,8,15,16,23,42);
       List<Double> res = IntStream.range(0, list.size() - 2)
                .mapToObj(i-> (list.get(i)+ list.get(i+1) +list.get(i+2))/3.0)
                .toList();
        System.out.println(res);

        int window = 3;
       List<Double> res1 = IntStream.range(0,(list.size() - (window - 1)))
                .mapToObj(i->list.subList(i, i+window))
               .map(w->w.stream()
                       .mapToInt(Integer::intValue)
                       .average()
                       .orElse(0.0)
               ).toList();
        System.out.println(res1);
    }
}
