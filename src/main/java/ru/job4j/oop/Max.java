package ru.job4j.oop;

public class Max {

    public int max(int first, int second) {
        int result = first > second ? first : second;
        return result;
    }

    public int max(int first, int second, int third) {
        int tmp = max(first, second);
        return max(tmp, third);
    }

    public int max(int first, int second, int third, int fourth) {
        int temp = max(first, second, third);
        return max(temp, fourth);
    }
}
