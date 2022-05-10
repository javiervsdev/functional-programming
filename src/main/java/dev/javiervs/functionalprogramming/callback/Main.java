package dev.javiervs.functionalprogramming.callback;

import javax.security.auth.callback.Callback;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        hello("Javier",
                null,
                value -> System.out.println("No lastname provided for " + value));

        hello2("Javier",
                null,
                () -> System.out.println("No lastname provided"));
    }

    static void hello(String firstname, String lastname, Consumer<String> callBack) {
        System.out.println(firstname);
        if (lastname != null) {
            System.out.println(lastname);
        } else {
            callBack.accept(firstname);
        }
    }

    static void hello2(String firstname, String lastname, Runnable callBack) {
        System.out.println(firstname);
        if (lastname != null) {
            System.out.println(lastname);
        } else {
            callBack.run();
        }
    }
}
