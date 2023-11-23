package strategy;

import java.util.ArrayList;

public class BubbleSorter implements Sorter{

	@Override
	public void sort(ArrayList<Double> data) {
		System.out.println("Using Bubble Sort");
		double temp;
		for(int i = 0; i < data.size(); i++) {
			for(int j = 0; j < data.size() - 1; j++) {
				if(data.get(j) > data.get(j+1)) {
					temp = data.get(j);
					data.set(j, data.get(j+1));
					data.set(j+1, temp);
				}
			}
		}
		
	}

}
