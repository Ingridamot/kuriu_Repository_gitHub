package com.motuziene.uzduotis4;

import java.util.List;
import java.util.Optional;

public class CustomerApp {

    private static final List<Customer> CUSTOMERS = List.of(
            new Customer("Petras", "Petraitis","petraitis@petras.lt", "865915423"),
            new Customer(null, "Jonaitis","jonaitis@jonas.lt", "865915426"),
            new Customer("Ignas", "Ignaitis",null, "865915426"),
            new Customer("Saulius", "Saulaitis","saulaitis@saulius.lt", "865915426")
    );

    public static void main(String[] args) {

        CUSTOMERS.forEach(customer -> {
            Optional.ofNullable(customer.firsName())
                    .ifPresentOrElse(value -> System.out.println("First name of customer is: " + value), () -> System.out.println( "First name is empty"));
                });

        System.out.println("------------------------------------");

        CUSTOMERS.forEach(customer -> {
            Optional.ofNullable(customer.email())
                    .ifPresentOrElse(value -> System.out.println("Emails of customer is: " + value), () -> System.out.println( "Email contact is empty"));
        });

        System.out.println("---------------map()-----------------");

        CUSTOMERS.stream()
                .map(customer -> customer.phone())
                .forEach(phone -> System.out.println("Phone number of customer is: " + phone));

        System.out.println("---------------map() & flatMap()-----------------");

        CUSTOMERS.stream()
                .map(customer -> customer.phone())
                .flatMap(customer -> customer.phone().stream())
                .forEach(phoneNumber -> System.out.println("Phone number of customer is: " + phoneNumber));
    }
}
