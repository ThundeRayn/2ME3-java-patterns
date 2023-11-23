

public class Animal {
    private double weight;
    private String name;
    private int age;
    private double height;
    private int numOflegs;
    private boolean isAlive;
    protected double temp;
    protected int calories; //so u can extend and inheritate

    public Animal(double newweight){//if only with this one, cannot miss input
        this.age = 0;
        this.isAlive = true;
        this.weight=newweight; //when it is private, sue this.balabala
    }
    public Animal(){ //two constructors are allowed
        age = 0;
        isAlive = true;
        weight=0;
    }

    public void makeNoise(){
        System.out.println("Meoww");
    }
    
    public double getWeight(){
        return weight;
    }

    //auto-generate getters and setters
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public int getNumOflegs() {
        return numOflegs;
    }
    public void setNumOflegs(int numOflegs) {
        this.numOflegs = numOflegs;
    }
    public boolean isAlive() {
        return isAlive;
    }
    public void setAlive(boolean isAlive) {
        this.isAlive = isAlive;
    }
    public double getTemp() {
        return temp;
    }
    public void setTemp(double temp) {
        this.temp = temp;
    }
    public int getCalories() {
        return calories;
    }
    public void setCalories(int calories) {
        this.calories = calories;
    }
}