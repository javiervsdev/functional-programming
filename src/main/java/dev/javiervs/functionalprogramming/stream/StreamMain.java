package dev.javiervs.functionalprogramming.stream;

import dev.javiervs.functionalprogramming.common.Person;

import java.util.List;

import static dev.javiervs.functionalprogramming.common.Gender.FEMALE;
import static dev.javiervs.functionalprogramming.common.Gender.MALE;

public class StreamMain {
    private final static List<Person> people;

    static {
        people = List.of(
                new Person("John", MALE),
                new Person("Maria", FEMALE),
                new Person("Aisha", FEMALE),
                new Person("Alex", MALE),
                new Person("Alice", FEMALE)
        );
    }

    public static void main(String[] args) {
        System.out.println("All names size");
        people.stream()
                .map(Person::name)
                .mapToInt(String::length)
                .forEach(System.out::println);

        System.out.println("Check if all people have female gender");
        boolean containsOnlyFemales = people.stream()
                .allMatch(person -> FEMALE.equals(person.gender()));
        System.out.println(containsOnlyFemales);

        System.out.println("Check if exists at least one female");
        boolean containsAnyFemales = people.stream()
                .anyMatch(person -> FEMALE.equals(person.gender()));
        System.out.println(containsAnyFemales);
    }
}
