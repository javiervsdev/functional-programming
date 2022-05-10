# functional_programming
Project to learn java functional programming

### Function

It is a functional interface that takes a single argument and returns a value.

- Example:
```java
Function<String, Integer> length = x -> x.length();
```

### BiFunction

It is similar to Function, but it takes two arguments and returns a value.

- Example:
```java
BiFunction<Integer, Integer, Integer> sum = (x, y) -> x + y
```

### Consumer

It takes a single argument and does not return a value.

- Example:
```java
Consumer<String> print = x -> System.out.println(x);
```

### BiConsumer

It is similar to Consumer, but it takes two arguments and does not return a value.

- Example:
```java
BiConsumer<String, String> print = (x, y) -> System.out.println(x + y);
```

### Predicate

It takes a single argument and returns a boolean value.

- Example:
```java
Predicate<String> isEmpty = x -> x.isEmpty();
```