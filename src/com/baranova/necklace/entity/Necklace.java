package com.baranova.necklace.entity;

import java.util.HashSet;
import java.util.Set;

public class Necklace {

    private String name;
    private int cost;
    private double weightCarats;
    private Set <Stone>  composition;

    public Necklace() {

    }
    public Necklace(String name, Set<Stone> composition) {
        this.name = name;
        this.composition = composition;
    }

    public String getName() {
        return name;
    }
    public int getCost() {
        return cost;
    }
    public double getWeightCarats() {
        return weightCarats;
    }
    public Set<Stone> getComposition() {
        Set <Stone> cloneComposition=new HashSet<>();
        cloneComposition.addAll(composition);
        return cloneComposition;

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public void setWeightCarats(double weightCarats) {
        this.weightCarats = weightCarats;
    }

    public void setComposition(Set<Stone> composition) {
        this.composition = composition;
    }

    @Override
    public String toString() {
        return "Necklace{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                ", weightCarats=" + weightCarats +
                '}';
    }

}
