package dev.javiervs.functionalprogramming.functionalinterface;

import java.util.List;
import java.util.function.Supplier;

public class SupplierMain {
    public static void main(String[] args) {
        System.out.println(getDBConnectionUrl());
        System.out.println(getDBConnectionUrlsSupplier.get());
    }

    static Supplier<List<String>> getDBConnectionUrlsSupplier =
            () -> List.of(
                    "jdbc:mysql://localhost:3306/test",
                    "jdbc:mysql://localhost:3306/test2");

    static String getDBConnectionUrl() {
        return "jdbc:mysql://localhost:3306/test";
    }
}
