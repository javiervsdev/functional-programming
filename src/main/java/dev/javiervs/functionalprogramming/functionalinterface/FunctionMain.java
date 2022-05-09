package dev.javiervs.functionalprogramming.functionalinterface;

import java.util.function.Function;

public class FunctionMain {
    public static void main(String[] args) {
        int baseValue = 10;
        int increment = incrementByOne(baseValue);
        System.out.println(increment);

        Integer incremented = incrementByOneFunction.apply(baseValue);
        System.out.println(incremented);
    }

    static Function<Integer, Integer> incrementByOneFunction =
            number -> number + 1;

    static int incrementByOne(int number) {
        return number + 1;
    }
}
