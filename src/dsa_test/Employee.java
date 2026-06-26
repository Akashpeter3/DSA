package dsa_test;

import java.util.List;

public class Employee {

    private String name;
    private int age;
    private double salary;
    private String country;
    List<String>skills;


    public Employee(String name, int age, double salary, String country, List<String>skills) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.country = country;
        this.skills =skills;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public String getCountry() {
        return country;
    }

    public List<String> getSkills() { return skills; }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", country='" + country + '\'' +
                ", skills=" + skills +
                '}';
    }
}
