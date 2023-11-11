package com.motuziene.uzduotis3;

import com.motuziene.uzduotis2.Movies;
import org.w3c.dom.ls.LSOutput;

import java.util.List;
import java.util.Optional;

public class EmployeeApp {

    private static final List<Employee> EMPLOYEE = List.of(
            new Employee("Arijus", "Petraitis", 8000, 5, "Java developer"),
            new Employee("Saulius","Petraitis", 7000,5, "Java developer"),
            new Employee("Jonas","Petraitis", 6000,5, "Java developer"),
            new Employee("Petras","Petraitis", 6000,5, "Java developer"),
            new Employee("Simona","Petraitis", 500,5, "Java developer"),
            new Employee("Antanas","Petraitis", 2000, 5, "Java developer")

    );


    public static void main(String[] args) {


Employee employee = new Employee("Arijus", null, 8000, 5, "Java developer");

        Optional.ofNullable(employee.lastName())
                .ifPresent(value -> System.out.println(value));
        Optional.ofNullable(employee.lastName())
                .ifPresentOrElse(value -> System.out.println(value), () -> System.out.println("Empty"));

//        EMPLOYEE.stream()
//                .sorted((emp1, emp2) -> emp1.lastName().compareTo(emp2.lastName()))
//                .forEach(System.out::println);

        EMPLOYEE.stream()
                .sorted((emp1, emp2) -> {
                    int surnameCompare = emp1.lastName().compareTo(emp2.lastName());
                    if (surnameCompare != 0){
                        return surnameCompare;
                    }
                    return  emp1.firstName().compareTo(emp2.firstName());
                })
                .forEach(System.out::println);



    }

}
