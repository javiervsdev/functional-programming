package dev.javiervs.functionalprogramming.optional;

import java.util.Optional;

public class Main {

    private static final String DEFAULT_VALUE = "Default value";

    public static void main(String[] args) {

        Object value = Optional.ofNullable(null)
                .orElseGet(() -> DEFAULT_VALUE);
        System.out.println(value);

        Optional.ofNullable("javiervs.dev")
                .ifPresent(System.out::println);

        Optional.ofNullable("javiervs.dev@gmail.com")
                .ifPresentOrElse(
                        email -> System.out.println("You can send me emails to " + email),
                        () -> System.out.println("No email to show"));

        value = Optional.ofNullable(null)
                .orElseThrow(() -> new IllegalStateException("Value is null"));
        System.out.println(value);
    }
}
