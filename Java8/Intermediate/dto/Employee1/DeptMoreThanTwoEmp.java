package Java8.Intermediate.dto.Employee1;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DeptMoreThanTwoEmp {

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(1,"John","HR",47000),
                new Employee(2,"mike","IT",77000),
                new Employee(3,"vikram","Finance",45000),
                new Employee(4,"singh","HR",62000),
                new Employee(6,"pal","HR",49000),
                new Employee(7,"joy","Operations",59000),
                new Employee(8,"kim","IT",69000),
                new Employee(9,"jim","IT",79000)
        );

     List<String> map = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment,
                Collectors.counting())).entrySet().stream().
              filter(e->e.getValue()>2)
              .map(Map.Entry::getKey)
              .toList();
        System.out.println(map);
//        List<String> res = map.entrySet().stream().
//                filter(e->e.getValue()>2)
//                .map(Map.Entry::getKey)
//                .toList();
//        System.out.println(res);
    }
}
