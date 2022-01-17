package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book[] books = new Book[]{
                new Book("Chehov", 250),
                new Book("Hugo", 200),
                new Book("Clean code", 1),
                new Book("Joyce", 550)
        };
        printBooks(books);
        System.out.println("Replace \"Clean code\" to \"Joyce\"");
        Book temp = books[0];
        books[0] = books[3];
        books[3] = temp;
        printBooks(books);
        System.out.println("Check \"Clean code\"");
        for (Book bookNew : books) {
            if (bookNew.getName().equals("Clean code")) {
                System.out.println(bookNew.getName());
            }
        }
    }

    private static void printBooks(Book[] books) {
        for (Book bookNew : books) {
            System.out.println(bookNew.getName() + ", " + bookNew.getPages() + " pages");
        }
    }
}

