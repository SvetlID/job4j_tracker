package ru.job4j.function;

import java.util.function.BiFunction;

public class Lambda {
    static class Executor {
        BiFunction<Integer, Integer, Integer> exec;

        public Executor(BiFunction<Integer, Integer, Integer> exec) {
            this.exec = exec;
        }

        public int execute(int first, int second) {
            return exec.apply(first, second);
        }
    }

    public static void main(String[] args) {
        Executor executor = new Executor((integer, integer2) -> integer + integer2);

        System.out.println("Excutor is " + executor.execute(3, 6));
    }
}
