package com.company;

public class IrishCoffeeMachine extends CoffeeMachine{
    private double whisky;

    public IrishCoffeeMachine(String coffee, double water, String heater, double whisky) {
        super(coffee, water, heater);
        this.whisky = whisky;
    }


    @Override
    public Coffee makeCoffee() throws Exception {
        if(getWater()<=0)throw new Exception("No water!");
        if(whisky<=0)throw new Exception("No whisky!");
        updateWater(-1);
        whisky--;
        return new Coffee("irish");

    }
}
