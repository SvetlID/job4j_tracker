package ru.job4j.pojo;

public class Store {

    public static void main(String[] args) {
        Product[] prods = new Product[]{
                new Product("Milk", 4),
                new Product("Bread", 4),
                new Product("Egg", 19)
        };
        for (Product pr : prods) {
            System.out.println(pr.getName() + " - " + pr.getCount());
        }
        System.out.println("Replace milk to oil.");
        Product oil = new Product("Oil", 11);
        prods[0] = oil;
        for (Product pr : prods) {
            if (pr.getCount() > 10) {
                System.out.println(pr.getName() + " - " + pr.getCount());
            }
        }
    }
}
