package ru.job4j.inheritance;

public class Engineer extends Profession {

    private String repairEquipment;

    public Engineer(String name, String surname, String education, double birthday, String repairEquipment) {
        super(name, surname, education, birthday);
        this.repairEquipment = repairEquipment;
    }

    public String getRepairEquipment() {
        return getRepairEquipment();
    }
}
