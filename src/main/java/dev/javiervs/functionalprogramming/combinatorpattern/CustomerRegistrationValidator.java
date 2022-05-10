package dev.javiervs.functionalprogramming.combinatorpattern;

import java.time.LocalDate;
import java.time.Period;
import java.util.function.Function;

import static dev.javiervs.functionalprogramming.combinatorpattern.ValidationResult.*;

public interface CustomerRegistrationValidator extends Function<Customer, ValidationResult> {
    int ADULT_AGE = 18;

    static CustomerRegistrationValidator isEmailValid() {
        return customer -> customer.email().contains("@")
                ? SUCCESS
                : EMAIL_NOT_VALID;
    }

    static CustomerRegistrationValidator isPhoneNumberValid() {
        return customer -> customer.phoneNumber().matches("\\d{9}")
                ? SUCCESS
                : PHONE_NUMBER_NOT_VALID;
    }

    static CustomerRegistrationValidator isAdult() {
        return customer -> Period.between(customer.birthdate(), LocalDate.now()).getYears() >= ADULT_AGE
                ? SUCCESS
                : IS_NOT_ADULT;
    }

    default CustomerRegistrationValidator and (CustomerRegistrationValidator other) {
        return customer -> {
            ValidationResult result = this.apply(customer);
            return SUCCESS.equals(result) ? other.apply(customer) : result;
        };
    }
}
