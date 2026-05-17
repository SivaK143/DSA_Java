package Java8.Hard;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseWordStream {

    public static void main(String[] args) {
        String sentence = "Java Streams are powerful";

     String res = Arrays.stream(sentence.split(" "))
                .map(word -> new StringBuilder(word).reverse())
                .collect(Collectors.joining(" "));
        System.out.println(res);

//        without String Builder
      String collect = Arrays.stream(sentence.split(" "))
                .map(word -> Arrays.stream(word.split(""))
                        .reduce("",(rev,ch)->ch+rev)
                )
                .collect(Collectors.joining(" "));
        System.out.println(collect);
    }
}
