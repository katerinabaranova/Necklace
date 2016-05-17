package com.baranova.necklace.entity;


public class Amber extends Stone{

    private double numberHardness;

    public Amber() {
    }

    public Amber(String name, int cost, double weight, double transperancy, double numberHardness) {
        super(name, cost, weight, transperancy);
        this.numberHardness = numberHardness;
    }

    public double getNumberHardness() {
        return numberHardness;
    }

    public void setNumberHardness(double numberHardness) {
        this.numberHardness = numberHardness;
    }

    @Override
    public String toString() {
        return "Amber{" +
                "name='" + super.getName() + '\'' +
                ", cost=" + super.getCost() +
                ", weight=" + super.getWeight() +
                ", transparency=" + super.getTransparency() +
                ",numberHardness=" + numberHardness +
                '}';
    }

}
