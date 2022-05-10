package dev.javiervs.functionalprogramming.combinatorpattern;

import java.time.LocalDate;
import java.time.Period;

public class CustomerValidatorService {

    public boolean isValid(Customer customer) {
        return isEmailValid(customer.email())
                && isPhoneNumberValid(customer.phoneNumber())
                && isAdult(customer.birthdate());
    }

    public static final int ADULT_AGE = 18;

    private boolean isEmailValid(String email) {
        return email.contains("@");
    }

    private boolean isPhoneNumberValid(String phoneNumber) {
        return phoneNumber.matches("\\d{9}");
    }

    private boolean isAdult(LocalDate birthDate) {
        return Period.between(birthDate, LocalDate.now()).getYears() >= ADULT_AGE;
    }
}
