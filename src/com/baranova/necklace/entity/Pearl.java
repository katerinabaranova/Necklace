package src.com.baranova.necklace.entity;


public class Pearl extends Stone {

    private double diameter;

    public Pearl() {
    }

    public Pearl(String name, int cost, int weight, int transperancy, double diameter) {
        super(name, cost, weight, transperancy);
        this.diameter = diameter;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    @Override
    public String toString() {
        return "Pearl{" +
                "name='" + super.getName() + '\'' +
                ", cost=" + super.getCost() +
                ", weight=" + super.getWeight() +
                ", transperancy=" + super.getTransparency() +
                ",diameter=" + diameter +
                '}';
    }

}
