package Java8.Intermediate.person;

import java.util.Arrays;
import java.util.List;

public class AgeExample {

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Alice",25),
                new Person("John",35),
                new Person("mike",20),
                new Person("peter",28)
        );

      double avgAge =  people.stream()
                .mapToInt(Person::getAge)
                .average().orElse(0.0);
    }
}
