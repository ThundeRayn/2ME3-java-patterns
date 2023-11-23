package Decorator;

public class Guac extends BurritoDecorator{
    public Guac(Burritos burrito){
        super(burrito);//why super here?
    }

    @Override
    public double getCost() {
        return 2 + burrito.getCost();
    }

    @Override
    public String getString() {
        return "Guac";
    }
    
}
