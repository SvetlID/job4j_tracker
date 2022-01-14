package ru.job4j.inheritance;

public class Programmer extends Engineer {

    private String task;

    public Programmer(String name, String surname, String education, double birthday, String repairEquipment, String task) {
        super(name, surname, education, birthday, repairEquipment);
        this.task = task;
    }

    public double getTask() {
        return getTask();
    }

}
