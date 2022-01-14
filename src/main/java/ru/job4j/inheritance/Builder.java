package ru.job4j.inheritance;

public class Builder extends Engineer {

    private double smetaRub;

    public Builder(String name, String surname, String education, double birthday, String repairEquipment, double smetaRub) {
        super(name, surname, education, birthday, repairEquipment);
        this.smetaRub = smetaRub;
    }

    public double getSmetaRub() {
        return getSmetaRub();
    }
}
