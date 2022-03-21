package com.company;

public class NescafeMachine extends CoffeeMachine{
    public NescafeMachine(String coffee, double water, String heater) {
        super(coffee, water, heater);
    }

    @Override
    public double getWater() {
        return super.getWater();
    }

    @Override
    public void updateWater(double i) {
        super.updateWater(i);
    }

    @Override
    public Coffee makeCoffee() throws Exception {
        if(getWater()<=0)throw new Exception("No water!");
        updateWater(-1);
        return new Coffee("nescafe");
    }
}
