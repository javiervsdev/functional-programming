package dev.javiervs.functionalprogramming.functionalinterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class BiFunctionMain {
    public static void main(String[] args) {
        int result = incrementBy1AndMultiply.apply(1, 3);
        System.out.println(result);

        int sumResult = sum.apply(1, 2);
        System.out.println(sumResult);
    }

    static BiFunction<Integer, Integer, Integer> sum = (x, y) -> x + y;
    static BiFunction<Integer, Integer, Integer> incrementBy1AndMultiply =
            (initialNumber, multiplier) -> (initialNumber + 1) * multiplier;
}
