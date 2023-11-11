package com.motuziene.uzduotis3;

import com.motuziene.uzduotis2.Movies;
import org.w3c.dom.ls.LSOutput;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

public class EmployeeApp {

    private static final List<Employee> EMPLOYEE = List.of(
            new Employee("Arijus", "Adomaitis", 8000, 5, "Java developer"),
            new Employee("Saulius","Saulaitis", 7000,2, "Java developer"),
            new Employee("Jonas","Jonaitis", 6000,3, "Java developer"),
            new Employee("Petras","Petraitis", 6000,5, "C++ developer"),
            new Employee("Simona","Antanaityte", 500,10, "Java developer"),
            new Employee("Antanas","Setraitis", 2000, 15, "Phyton"),
            new Employee("Linas", "Adomaitis", 8000, 5, "Java developer"),
            new Employee("Kinas", "Adomaitis", 8000, 5, "Java developer"),
            new Employee("Kinas", "Adomaitis", 6000, 5, "Phyton"),
            new Employee("Kinas", "Adomaitis", 4000, 5, "Phyton"),
            new Employee("Kinas", "Adomaitis", 8000, 5, "Java developer"),
            new Employee("Kinas", "Adomaitis", 2000, 5, "Phyton"),
            new Employee("Faustas", "Adomaitis", 8000, 5, "Java developer")

    );


    public static void main(String[] args) {


//Employee employee = new Employee("Arijus", null, 8000, 5, "Java developer");
//
//        Optional.ofNullable(employee.lastName())
//                .ifPresent(value -> System.out.println(value));
//        Optional.ofNullable(employee.lastName())
//                .ifPresentOrElse(value -> System.out.println(value), () -> System.out.println("Empty"));

//        EMPLOYEE.stream()
//                .sorted((emp1, emp2) -> emp1.lastName().compareTo(emp2.lastName()))
//                .forEach(System.out::println);

//        EMPLOYEE.stream()
//                .sorted((emp1, emp2) -> {
//                    int surnameCompare = emp1.lastName().compareTo(emp2.lastName());
//                    if (surnameCompare != 0){
//                        return surnameCompare;
//                    }
//                    return  emp1.firstName().compareTo(emp2.firstName());
//                })
//                .forEach(System.out::println);

        EMPLOYEE.stream()
                .filter(employee -> employee.workExperience()>3)
                .filter(employee -> employee.lastName().startsWith("A") || employee.lastName().startsWith("S"))
                .filter(employee -> employee.salary()>7000)
                .filter(employee -> employee.role().contains("Java"))
                .forEach(System.out::println);

        System.out.println("---------------------------------------------------------");

        BigDecimal totalSalary = EMPLOYEE.stream()
                .filter(employee -> employee.role().contains("Phyton"))
                .map(employee -> new BigDecimal(String.valueOf(employee.salary())))
                .reduce(BigDecimal.ZERO, (acc, value) ->acc.add(value));
        System.out.println("Total salary is:  " + totalSalary);

    }

}
