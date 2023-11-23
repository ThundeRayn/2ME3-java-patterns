package Decorator;

public class ChickenBurrito implements Burritos{

    @Override
    public String getString(){
        return "ChickenBurrito..........$12";
    }

    @Override
    public double getCost(){
        return 12;
    }
    
}
