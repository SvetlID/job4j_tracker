package ru.job4j.function;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.*;

public class FunctionInterfaceUsage {
    public static void main(String[] args) {
        Supplier<String> sup = () -> "New String For Interface";
        System.out.println(sup.get());
        List<String> list = List.of("one", "two", "three", "one", "two", "three");
        Supplier<Set<String>> sup1 = () -> new HashSet<>(list);
        Set<String> strings = sup1.get();
        for (String s : strings) {
            System.out.println(s);
        }
        Supplier<String> sup2 = () -> "New String For Interface";
        Consumer<String> consumer = (s1) -> System.out.println(s1);
        consumer.accept(sup.get());
        Supplier<String> sup3 = () -> "New String For Interface";
        BiConsumer<String, String> consumer2 = (s3, s4) -> System.out.println(s3 + s4);
        consumer2.accept(sup3.get(), " and Second String");
        List<String> list1 = List.of("one", "two", "three", "one", "two", "three");
        Supplier<Set<String>> sup4 = () -> new HashSet<>(list1);
        BiConsumer<Integer, String> consumer3 = (s1, s2) -> System.out.println(s1 + s2);
        Set<String> strings1 = sup4.get();
        int i = 1;
        for (String s : strings1) {
            consumer3.accept(i++, " is " + s);
        }
        Predicate<String> pred = s -> s.isEmpty();
        System.out.println("Строка пустая: " + pred.test(""));
        System.out.println("Строка пустая: " + pred.test("test"));
        BiPredicate<String, Integer> cond = (s, i1) -> s.contains(i1.toString());
        System.out.println("Строка содержит подстроку: " + cond.test("Name123", 123));
        System.out.println("Строка содержит подстроку: " + cond.test("Name", 123));
        Function<String, Character> func = s -> s.charAt(2);
        System.out.println("Третий символ в строке: " + func.apply("first"));
        System.out.println("Третий символ в строке: " + func.apply("second"));
        BiFunction<String, Integer, String> biFunc = (s, i1) -> s.concat(" ").concat(i1.toString());
        System.out.println("Результат работы бифункции: " + biFunc.apply("Name", 123));
        System.out.println("Результат работы бифункции: " + biFunc.apply("String number", 12345));
        UnaryOperator<StringBuilder> builder = b -> b.reverse();
        System.out.println("Строка после реверса: " + builder.apply(new StringBuilder("String for test")));
        System.out.println("Строка после реверса: " + builder.apply(new StringBuilder("tset rof gnirtS")));
        BinaryOperator<StringBuilder> builder1 = (b1, b2) -> b1.append(" ").append(b2);
        System.out.println(
                "Строка после объединения: " + builder1.apply(
                        new StringBuilder("First string"),
                        new StringBuilder("Second string")
                )
        );
    }
}

