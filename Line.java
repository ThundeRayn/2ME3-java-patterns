public class Line {
    private Point start;
    private Point end;

    public Line(){
        setStart(start);
        setEnd(end);
    }
    
    public Point getStart(){
        return start;
    }

    public void setStart(Point start){
        this.start=start;
    }

    public Point getEnd(){
        return end;
    }

    public void setEnd(Point end){
        this.end=end;
    }

    public double length(){
        return start.getDistance(end);
    }
    
    public String toString(){
        return start.toString()+"---------->"+end.toString();
    }

    public void print(){
        System.out.println(toString());
    }
    
}
