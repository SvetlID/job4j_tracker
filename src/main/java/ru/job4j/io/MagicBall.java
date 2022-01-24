package ru.job4j.io;

import java.util.Random;
import java.util.Scanner;

public class MagicBall {
    @SuppressWarnings("checkstyle:WhitespaceAround")
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Я великий оракул. Что ты хочешь узнать? ");
        String name = input.nextLine();
        int answer = new Random().nextInt(3);
        String ans = switch (answer) {
            case 0 -> "Да";
            case 1 -> "Нет";
            default -> "Может быть";
        };
        System.out.println(ans);

    }
}
