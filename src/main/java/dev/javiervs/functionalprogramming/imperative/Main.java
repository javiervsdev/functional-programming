package dev.javiervs.functionalprogramming.imperative;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static dev.javiervs.functionalprogramming.imperative.Gender.*;

public class Main {
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

        //Imperative approach to find females
        System.out.println("- Imperative approach");
        List<Person> imperativeFemales = new ArrayList<>();
        for (Person person : people) {
            if (FEMALE.equals(person.gender())) {
                imperativeFemales.add(person);
            }
        }

        for (Person female : imperativeFemales) {
            System.out.println(female);
        }


        //Declarative approach to find females
        System.out.println("- Declarative approach");
        List<Person> declarativeFemales = people.stream()
                .filter(person -> FEMALE.equals(person.gender()))
                .toList();
        declarativeFemales.forEach(System.out::println);
    }
}
