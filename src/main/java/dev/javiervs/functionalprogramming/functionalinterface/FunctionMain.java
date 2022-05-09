package dev.javiervs.functionalprogramming.functionalinterface;

import java.util.function.Function;

public class FunctionMain {
    public static void main(String[] args) {
        int baseValue = 10;

        //Example using imperative function to increment by one
        int incrementExample = incrementByOne(baseValue);
        System.out.println(incrementExample);

        //Example using functional interface to increment by one
        Integer increment = incrementBy1Function.apply(baseValue);
        System.out.println(increment);

        //Example using functional interface to multiply by ten
        int multiply = multiplyBy10Function.apply(increment);
        System.out.println(multiply);

        //Example using functional interface to increment by one and multiply by ten in one line
        int incrementAndMultiplyInlineResult = incrementBy1Function
                .andThen(multiplyBy10Function)
                .apply(baseValue);
        System.out.println(incrementAndMultiplyInlineResult);
    }

    static Function<Integer, Integer> incrementBy1Function =
            number -> number + 1;

    static Function<Integer, Integer> multiplyBy10Function =
            number -> number * 10;
    static int incrementByOne(int number) {
        return number + 1;
    }
}
