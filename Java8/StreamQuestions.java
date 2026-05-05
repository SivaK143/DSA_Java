package Java8;

import com.sun.source.doctree.SeeTree;

import java.util.*;
import java.util.stream.Collectors;

public class StreamQuestions {

    public static void main(String[] args) {
        
        //1. Find all distinct elements from a list(remove duplicates)
        List<Integer> numbers = Arrays.asList(5,2,8,2,3,5,9,3);
        //one way to do(order not maintained)
       Set<Integer> set = numbers.stream().collect(Collectors.toSet()); //will not maintain any insertion order
        System.out.println(set);
        Set<Integer> set1 = new HashSet<>(numbers); // we can directly convert to Hashset instead of using stream
        //another way(follow order)

       List<Integer> list = numbers.stream().distinct().toList();
        System.out.println(list);


        //2. Find the average of all numbers in a list
        List<Integer> l1 = Arrays.asList(5,10,15,20,25);

      double avg =  l1.stream().mapToInt(Integer::intValue)
                .average().getAsDouble();
        l1.stream().mapToInt(Integer::intValue)
                .average().orElse(0.0);//assign default value
        System.out.println(avg);

        //3. sort the list in ascending order
        List<Integer> l2 = Arrays.asList(5,1,8,3,4,2);

        System.out.println(l2.stream().sorted().toList());

        //3. sort the list in descending order
        System.out.println(l2.stream().sorted(Comparator.reverseOrder()).toList());

        //4. count how many string will start with a specific letter like 'A'
        List<String> fruits = Arrays.asList("Apple","Banana","Avacado","Mango","Apricot");
        System.out.println(fruits.stream().filter(fr->fr.startsWith("A")).toList());
        System.out.println(fruits.stream().filter(fr->fr.startsWith("A")).count());

        //5. Join all strings in alist in to single seperated by comma
        String collect = fruits.stream().collect(Collectors.joining(",","[","]"));
        System.out.println(collect);

        //6. check if all elements are psoitive or not
        System.out.println(l2.stream().allMatch(n->n>0)); //all elememts should pass the condition specified otherwise return false

        //7. Check if any number is divisible by 3
        System.out.println(l2.stream().anyMatch(n->n%3==0)); // if any number ios divisible returns true or else false

        //8. Flatten the list of list

        List<List<Integer>> lists = Arrays.asList(
                Arrays.asList(1,2,3),
                Arrays.asList(4,5),
                Arrays.asList(6,7)
        );

       List<Integer> li = lists.stream().flatMap(l -> l.stream()).toList();
        System.out.println(li);

        //9. find first non empty string in a list
        List<String> strings = Arrays.asList("","","Hello","World","");
        strings.stream().filter(s->!s.isEmpty()).toList(); // return all non empty strings
        Optional<String> first = strings.stream().filter(s->!s.isEmpty()).findFirst();
        System.out.println(first.get());
    }
}

