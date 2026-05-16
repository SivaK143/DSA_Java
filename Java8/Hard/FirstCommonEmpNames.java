package Java8.Hard;

import Java8.Intermediate.dto.Employee1.Employee;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstCommonEmpNames {

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(1,"john","HR",47000),
                new Employee(2,"mike","IT",77000),
                new Employee(3,"vikram","Finance",45000),
                new Employee(4,"singh","HR",62000),
                new Employee(6,"pal","HR",49000),
                new Employee(7,"joy","Operations",59000),
                new Employee(8,"kim","IT",69000),
                new Employee(9,"jim","IT",79000)
        );

     Map<Character, Long> map = employees.stream()
                .map(c->c.getName().charAt(0))
                .collect(Collectors.groupingBy(Function.identity(),
                        Collectors.counting()));
        System.out.println(map);
        //we need to find the max thats it
      Map.Entry<Character, Long> res =  map.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .orElseThrow();
        System.out.println(res);
    }
}
