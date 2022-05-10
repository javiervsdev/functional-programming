package dev.javiervs.functionalprogramming.functionalinterface;

import java.util.function.Predicate;

public class PredicateMain {
    public static void main(String[] args) {
        System.out.println("Whitout Predicate");
        System.out.println(isPhoneNumberValid("07000000000"));
        System.out.println(isPhoneNumberValid("0700000000"));
        System.out.println(isPhoneNumberValid("09000900990"));

        System.out.println("With Predicate");
        System.out.println(isPhoneNumberValidPredicate.test("07000000000"));
        System.out.println(isPhoneNumberValidPredicate.test("0700000000"));
        System.out.println(isPhoneNumberValidPredicate.test("09000900990"));

        System.out.println(
                "Is phone number 07000000003 valid and contains 3 = " +
                isPhoneNumberValidPredicate
                        .and(containsNumber3Predicate)
                        .test("07000000003"));
        System.out.println(
                "Is phone number 09000000003 valid and contains 3 = " +
                isPhoneNumberValidPredicate
                        .and(containsNumber3Predicate)
                        .test("09000000003"));
    }

    static Predicate<String> isPhoneNumberValidPredicate = phoneNumber ->
            phoneNumber.startsWith("07") && phoneNumber.length() == 11;

    static Predicate<String> containsNumber3Predicate = phoneNumber ->
            phoneNumber.contains("3");

    static boolean isPhoneNumberValid(String phoneNumber) {
        return phoneNumber.startsWith("07") && phoneNumber.length() == 11;
    }
}
