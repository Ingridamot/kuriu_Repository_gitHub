package com.motuziene;

import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        Consumer<String> print = x -> System.out.println(x);
        print.accept("JAVA consumer demo");

        Consumer<Person> greeter = (p) -> System.out.println("Hello, " + p.getName());
        greeter.accept(new Person("Luke", "Skywalker"));

        Predicate <String> predicate = (s) -> s.length() > 0;

        predicate.test("foo"); //true
        predicate.negate().test("foo"); //false

        Predicate<Boolean> nonNull = Objects::nonNull;
        Predicate<Boolean> isNool = Objects::isNull;

        Predicate<String> isEmpty = String ::isEmpty;
        Predicate<String> isNotEmpty = isEmpty.negate();

        Supplier<Person> personSupplier = Person::new;
        Person person = personSupplier.get();

    }
}
