package dev.javiervs.functionalprogramming.functionalinterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerMain {
    public static void main(String[] args) {
        Customer customer = new Customer("Javier", "123456789");
        greetCustomer(customer);
        greetCustomerConsumer.accept(customer);
        greetCustomerBiConsumer.accept(customer, false);
    }

    static Consumer<Customer> greetCustomerConsumer = customer -> System.out.printf(
            "Hello %s, thanks for registering phone number %s%n",
            customer.name(),
            customer.phone());

    static BiConsumer<Customer, Boolean> greetCustomerBiConsumer = (customer, showPhone) -> System.out.printf(
            "Hello %s, thanks for registering phone number %s%n",
            customer.name(),
            showPhone ? customer.phone() : "*********");

    static void greetCustomer(Customer customer) {
        System.out.printf(
                "Hello %s, thanks for registering phone number %s%n",
                customer.name(),
                customer.phone());
    }

    public record Customer(String name, String phone) {}
}
