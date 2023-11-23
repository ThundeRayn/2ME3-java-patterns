package implementt;

public class Mustang extends Machine2{
    public boolean isOn;

    @Override
    public void turnOn(){
        isOn = true;
    }

    @Override
    public void turnOff(){
        isOn = false;
    }
}
