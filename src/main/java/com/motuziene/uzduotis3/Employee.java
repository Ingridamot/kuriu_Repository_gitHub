package com.motuziene.uzduotis3;

import java.math.BigDecimal;
import java.util.Comparator;

public record Employee(String firstName, String lastName, double salary, int workExperience, String role) implements Comparable<Employee> {
    @Override

    public int compareTo(Employee o) {
        return this.lastName.compareTo(o.lastName);
   }

}
