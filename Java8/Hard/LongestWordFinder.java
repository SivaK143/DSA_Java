package Java8.Hard;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;

public class LongestWordFinder {

    public static void main(String[] args) {

        String sentence = "The quick, brown fox jumped over the lazy dog!";

      Optional<String> res = Arrays.stream(
                sentence.toLowerCase()
                        .replaceAll("[^a-z\\s]", "")
                        .split(" ")
        ).max(Comparator.comparing(String::length));
        System.out.println(res);
    }
}
