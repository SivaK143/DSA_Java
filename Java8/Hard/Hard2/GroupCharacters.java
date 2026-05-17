package Java8.Hard.Hard2;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupCharacters {

    public static void main(String[] args) {
        List<Character> chars = Arrays.asList(
                'A','b','3','z','X','#','7','m','@'
        );
        //group them accordingly
      Map<Object, List<Character>> res = chars.stream()
                .collect(Collectors.groupingBy(
                        //charCategory
                        ch -> getCharCategory(ch.charValue())
                ));
        System.out.println(res);
    }

    private static Object getCharCategory(char c) {
        if(Character.isUpperCase(c)) return CharCategory.UPPERCASE;
        if(Character.isLowerCase(c)) return CharCategory.LOWERCASE;
        if(Character.isDigit(c)) return CharCategory.DIGIT;
        return CharCategory.OTHER;
    }
}
