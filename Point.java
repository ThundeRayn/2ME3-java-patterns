public class Point {
    private double x;
    private double y;
    public static int z = 11; //static means sharing,
    // associated with class instead of objects
    public Point(/*note */){
        x=0;
        y=0;
    }//note: variables you put in here will be needed to 
    //be defined while adding a new Point 
    public String toString(){
        return "(" + x + "," + y + ")";
    }
    public void print(){
        System.out.println(toString());
    }
    public double getX() {
        return x;
    }
    public void setX(double x) {
        this.x = x;
    }
    public double getY() {
        return y;
    }
    public void setY(double y) {
        this.y = y;
    }
    public static int getZ() { //changing variables associated with class
        return z;
    }
    public static void setZ(int z) {
        Point.z = z;  
    }

    public void translateX(double x){
        this.x += x;
    }
    public void translateY(double y){
        this.y += y;
    }

    public double getDistance(Point point){
        //tobedone
        double xDiff=(this.x - point.getX());
        double yDiff=(this.y - point.getY());
        return Math.sqrt(Math.pow(xDiff,2) + Math.pow(yDiff,2));
    }


}
