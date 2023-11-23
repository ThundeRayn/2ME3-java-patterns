package strategy;

public class Runner1 {

	public static void main(String[] args) {
		SensorData sd = new SensorData();
		sd.addValue(5);
		sd.addValue(1);
		sd.addValue(9);
		sd.addValue(7);
		sd.addValue(1);
		sd.addValue(9);
		sd.addValue(5);
		sd.addValue(9);
		sd.addValue(-1);
		sd.addValue(9);
		sd.addValue(10);
		sd.addValue(9);
		sd.addValue(16621);
		sd.addValue(-9);
		
		//sd.setSort(new SelectionSorter());
		sd.sort();
		sd.print();
		
	}
	
}
