
public class Mammal extends Animal{
    public int mamGlands;

    public Mammal(double weight, int mamGlands){
        super(weight); //animal class: super class
        this.mamGlands=mamGlands;
    }

    public void genHeat(){
        temp +=1;
        calories -=10; //protected in Animals
    }

    public void makeNoise(){
        System.out.println("Auhhhhh");
    }
}
