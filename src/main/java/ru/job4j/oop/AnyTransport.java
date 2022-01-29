package ru.job4j.oop;

public class AnyTransport {
    public static void main(String[] args) {
        Vehicle airToMoscow = new Airplane();
        Vehicle airToPiter = new Airplane();
        Vehicle busToMoscow = new Bus();
        Vehicle busToLondon = new Bus();
        Vehicle trainToMoscow = new Train();
        Vehicle trainToPiter = new Train();
        Vehicle[] vehicles = new Vehicle[]{airToMoscow, airToPiter, busToMoscow, busToLondon, trainToMoscow, trainToPiter};
        for (Vehicle vehicle : vehicles) {
            vehicle.move();
            vehicle.refueling();
        }
    }
}
