package factory;

public class Gary extends Enemy{
    static private int x;
    static private int strength;
    static private Gary instance;

    public static Gary getInstance(){
        return instance;
    }

    public static int getX() {
        return x;
    }

    public static int getStrength() {
        return strength;
    }

    @Override
    public void takeDamage(int damage) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void attack() {
        // TODO Auto-generated method stub
        
    }

    
}
