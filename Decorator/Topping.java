package Decorator;

public class Topping {

    private double cost = 0;

    public Topping(double cost){
        this.cost = cost;
    }

    public void setcost(double cost){
        this.cost = cost;
    }
    
    public double getcost() {
        return cost;
    }
    
}
