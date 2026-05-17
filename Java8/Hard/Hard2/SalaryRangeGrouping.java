package Java8.Hard.Hard2;

import Java8.Intermediate.dto.Employee;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SalaryRangeGrouping {

    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee(101,"singh",60000),
                new Employee(102,"Alice",70000),
                new Employee(103,"John",45000),
                new Employee(104,"siva",100000),
                new Employee(104,"mukesh",105000)
        );
        //Low < 50k, Medium >50k and < 100k and remaining High
       Map<SalaryRange, List<Employee>> list = employees.stream()
                .collect(Collectors.groupingBy(
                        //range
                        e -> {
                            if(e.getSalary() <50000) return SalaryRange.LOW;
                            if(e.getSalary()<100000) return SalaryRange.MEDIUM;
                            else return SalaryRange.HIGH;
                        }
                ));
        System.out.println(list);
    }
}
