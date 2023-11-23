//Assignment0 - Shirong Tang
public class Square {
    private double sidelen;
    public Square(double sidelen){
        this.sidelen = sidelen;
    }
    
    public void setSideLength(double sidelen){
        this.sidelen = sidelen;
    }

    public double getPerimeter(){
        return 4*sidelen;
    }

    public double getArea(){
        return Math.pow(sidelen,2);
    }
}
