package Java8.Intermediate.dto.Employee1;

import java.util.*;
import java.util.stream.Collectors;

public class HighestPaidEachDept {

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(1,"John","HR",47000),
                new Employee(2,"mike","IT",77000),
                new Employee(3,"vikram","Finance",45000),
                new Employee(4,"singh","HR",62000),
                new Employee(5,"paul","HR",49000)
        );
        //output
        //HR -> singh
        //Finance -> vikram
        //IT -> mike

     Map<String, Optional<Employee>> list = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.maxBy(Comparator.comparing(Employee::getSalary))));

        System.out.println(list);
    }
}
