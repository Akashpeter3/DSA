package dsa_test;

import java.util.ArrayList;
import java.util.List;


public class TestCompleteJava8 {
    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();
        // Sample data set for stream operations below.
        employees.add(new Employee("Akash", 28, 65000, "India",
                List.of("Java", "Spring", "Docker")));

        employees.add(new Employee("Rahul", 32, 85000, "India",
                List.of("Java", "Kafka")));

        employees.add(new Employee("John", 40, 120000, "USA",
                List.of("AWS", "Docker", "Kubernetes")));

        // Collect uppercased names, excluding those starting with "R", sorted and joined by comma.
//        String name = employees.stream().map(Employee::getName)
//                .map(String::toUpperCase)
//               .filter(n ->!n.startsWith("R"))
//                .sorted()
//                .collect(Collectors.joining(","));

        // Sum all salaries using reduce.
//        double totalSalary = employees.stream().map(Employee::getSalary)
//               .reduce(0.0, Double::sum);

        // Count employees per country.
       // Map<String,Long> empMap = employees.stream().collect(Collectors.groupingBy(Employee::getCountry,Collectors.counting()));

        // Print country-wise employee counts.
//        empMap.forEach((na,count)->{System.out.println(na+ " "+count);
//        });

       // System.out.println(name);
//        System.out.println(totalSalary);
//        System.out.println();

        // Print employees with salary in the inclusive range [50000, 100000].
//        employees.stream().filter(e ->e.getSalary()>=50000)
//                .filter(e->e.getSalary()<=100000)
//                .toList()
//                .forEach(System.out::println);

        //employees.forEach(e ->System.out.println(e.getName()+ " "+e.getAge()));
employees.stream()
        .map(Employee::getSkills)
        .flatMap(List::stream)
        .distinct()
        .forEach(System.out::println);

    }
}
