package ru.job4j.inheritance;

public class Dentist extends Doctor {

    private int teethPerDay;

    public Dentist(String name, String surname, String education, double birthday, String patient, int teethPerDay) {
        super(name, surname, education, birthday, patient);
        this.teethPerDay = teethPerDay;
    }

    public int getTeethPerDay() {
        return getTeethPerDay();
    }

}
