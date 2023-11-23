package strategy;
import java.util.ArrayList;
//import java.util.Collections;

public class SensorData {

	private ArrayList<Double> data = new ArrayList<Double>();
	private Sorter sort;
	
	public SensorData() {
		sort = new DefaultSorter();
	}
	
	public void addValue(double value) {
		data.add(value);
	}
	
	public void setSort(Sorter sort) {
		this.sort = sort;
	}
	
	public void print() {
		System.out.println(data.toString());
	}
	
	public void sort() {
		sort.sort(data);
	}
	
	
}
