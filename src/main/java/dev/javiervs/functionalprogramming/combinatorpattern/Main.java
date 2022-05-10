package dev.javiervs.functionalprogramming.combinatorpattern;

import java.time.LocalDate;

import static dev.javiervs.functionalprogramming.combinatorpattern.CustomerRegistrationValidator.*;

public class Main {

    public static final CustomerValidatorService validatorService = new CustomerValidatorService();

    public static void main(String[] args) {

        Customer customer = new Customer("Javier",
                "javier.dev@gmail.com",
                "123456789",
                LocalDate.of(1994, 9, 24));
        //Using typical validation way
        System.out.println(validatorService.isValid(customer));

        //Using combinator pattern
        ValidationResult validationResult = isEmailValid()
                .and(isPhoneNumberValid())
                .and(isAdult())
                .apply(customer);

        System.out.println(validationResult);

        if (!ValidationResult.SUCCESS.equals(validationResult)) {
            throw new IllegalStateException(String.format("Customer %s is not valid", customer.name()));
        }
    }
}
