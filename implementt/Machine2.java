package implementt;

public abstract class Machine2{
    private double fuel = 0;
    
    public void fuelUp(double fuel){
        this.fuel += fuel;
    }

    public void run(double fuel){
        this.fuel -= fuel;
    }

    public abstract void turnOn();
    public abstract void turnOff();

    //getter
    public double getFuel() {
        return fuel;
    }


}
