package com.company;

public class Main {

    public static void main(String[] args) throws Exception {
	CoffeeMachine coffee1 = new CoffeeMachine("Lavazza", 6, "Bosch");
    CoffeeMachine coffee2 = new IrishCoffeeMachine("Bianchi", 3, "Tefal", 5);
    Functions nescafe = new NescafeMachine("Gold", 5, "Beko");
    Coffee coffee= coffee2.makeCoffee();
    System.out.println(coffee);
    coffee=coffee1.makeCoffee();
    System.out.println(coffee);
    coffee= nescafe.makeCoffee();
    System.out.println(coffee);
    }
}
