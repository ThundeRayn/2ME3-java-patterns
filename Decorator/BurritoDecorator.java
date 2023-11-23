package Decorator;

public abstract class BurritoDecorator implements Burritos{
    protected Burritos burrito;
    public BurritoDecorator(Burritos burrito){
        this.burrito = burrito;
    }

    @Override
    public abstract double getCost();

    @Override
    public abstract String getString();
    
}
