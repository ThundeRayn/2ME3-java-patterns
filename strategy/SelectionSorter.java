package strategy;
import java.util.ArrayList;

public class SelectionSorter implements Sorter{

	@Override
	public void sort(ArrayList<Double> data) {
		System.out.println("Using Selection Sort");
		if(data.size() == 0) {
			return;
		}
		for(int i = 0; i < data.size(); i++) {
			double minNum = Integer.MAX_VALUE;
			int minIndex = 0;
			for(int j = i; j < data.size(); j++) {
				if(data.get(j) < minNum) {
					minIndex = j;
					minNum = data.get(j);
				}
			}
			data.set(minIndex, data.get(i));
			data.set(i, minNum);
		}
		
	}

}
