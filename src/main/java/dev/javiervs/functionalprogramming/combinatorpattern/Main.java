package dev.javiervs.functionalprogramming.combinatorpattern;

import java.time.LocalDate;

public class Main {

    public static final CustomerValidatorService validatorService = new CustomerValidatorService();

    public static void main(String[] args) {

        Customer customer = new Customer("Javier",
                "javier.dev@gmail.com",
                "123456789",
                LocalDate.of(1994, 9, 24));

        System.out.println(validatorService.isValid(customer));
    }
}
