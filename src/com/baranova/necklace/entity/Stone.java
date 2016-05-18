package com.baranova.necklace.entity;


public class Stone {

    private String name;
    private int cost;
    private double weight;
    private double transparency;

    public Stone(){
    }

    public Stone(String name, int cost, double weight, double transperancy) {
        this.name = name;
        this.cost = cost;
        this.weight = weight;
        this.transparency =transperancy;
    }

    public String getName() {
        return name;
    }

    public int getCost() {
        return cost;
    }

    public double getWeight() {
        return weight;
    }

    public double getTransparency() {
        return transparency;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setTransparency(double transparency) {
        this.transparency = transparency;
    }

    @Override
    public String toString() {
        return "Stone{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                ", weight=" + weight +
                ", transparency=" + transparency +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stone stone = (Stone) o;
        if (cost != stone.cost) return false;
        if (Double.compare(stone.weight, weight) != 0) return false;
        if (Double.compare(stone.transparency, transparency) != 0) return false;
        return name.equals(stone.name);

    }


    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name.hashCode();
        result = 31 * result + cost;
        temp = Double.doubleToLongBits(weight);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(transparency);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

}
