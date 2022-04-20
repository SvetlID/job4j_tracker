package ru.job4j.lambda;

import java.util.Comparator;

public class FI {
    public static void main(String[] args) {
        Attachment[] atts = {
                new Attachment("image 1", 20),
                new Attachment("image 3", 120),
                new Attachment("image 2", 23)
        };
        Comparator<Attachment> comparator = (left, right) -> {
            System.out.println("compare - " + left.getSize() + " : " + right.getSize());
            return Integer.compare(left.getSize(), right.getSize());
        };
        Comparator<String> cmpSize = (left, right) -> {
            System.out.println("compare - " + left.length() + ":" + right.length());
            return Integer.compare(left.length(), right.length());
        };
        Comparator<String> cmpText = (left, right) -> {
            System.out.println("compareTo - " + left + ":" + right);
            return left.compareTo(right);
        };
        Comparator<String> cmpDescSize = (left, right) -> {
            System.out.println("compare -" + right.length() + ":" + left.length());
            return Integer.compare(right.length(), left.length());
        };
    }
}

