package ru.job4j.pojo;

public class College {

    public static void main(String[] args) {
        Student student = new Student();
        student.setFio("Дуброва Светлана Игоревна");
        student.setGroup("p-1");
        student.setDateReceipt("24.11.2021");

        System.out.println(student.getFio() + ", " + student.getGroup() + ", " + student.getDateReceipt());
    }
}
