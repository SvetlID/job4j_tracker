package ru.job4j.oop;

public class Error {

    private boolean active;
    private int status;
    private String message;

    public Error() {
    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public static void main(String[] args) {
        Error first = new Error();
        first.printInfo();
        Error second = new Error(true, 4, " correct error");
        second.printInfo();
        Error third = new Error(false, 3, " ok");
        third.printInfo();
    }

    public void printInfo() {
        System.out.println("Активный: " + active);
        System.out.println("Статус: " + status);
        System.out.println("Действие" + message);

    }
}
