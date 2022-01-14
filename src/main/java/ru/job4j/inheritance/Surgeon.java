package ru.job4j.inheritance;

public class Surgeon extends Doctor {

    private String operation;

    public Surgeon(String name, String surname, String education, double birthday, String patient, String operation) {
        super(name, surname, education, birthday, patient);
        this.operation = operation;
    }

    public String getOperation() {
        return getOperation();
    }
}
