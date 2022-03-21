package com.company;

public class CoffeeMachine implements Functions{
    private String coffee;
    private double water;
    private String heater;

    public CoffeeMachine(String coffee, double water, String heater) {
        this.coffee = coffee;
        this.water = water;
        this.heater = heater;
    }

    public double getWater() {
        return water;
    }
    public void updateWater(double i)
    {
        water+=i;
    }

    @Override
    public Coffee makeCoffee() throws Exception {
        if(water<=0)throw new Exception("No water!");
        water--;
        return new Coffee("espresso");
    }
}
