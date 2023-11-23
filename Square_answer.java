
public class Square_answer {
	private double SideL;
	
	public Square_answer(double SideL) {
		this.SideL = SideL;
	}
	
	public void setSideLength(double newSideL) {
		this.SideL = newSideL;
	}
	
	public double getPerimeter() {
		return 4 * this.SideL;
	}
	
	public double getArea() {
		return this.SideL * this.SideL;
	}
}
