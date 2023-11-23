package implementt;

public class Phone implements Machine{
    private int appCount;
    private boolean isOn;

    public Phone(){
        appCount = 0;
    }

    @Override
    public void turnOn(){
        isOn = true;
    }

    @Override
    public void turnOff(){
        isOn = false;
    }

    @Override //what do override do?
    public boolean getStatus(){
        return isOn;
    }

    //getter
    public int getAppAccount(){
        return appCount;
    }
}
