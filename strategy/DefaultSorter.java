package strategy;
import java.util.ArrayList;
//import java.util.Collection;
import java.util.Collections;

public class DefaultSorter implements Sorter{

	@Override
	public void sort(ArrayList<Double> data) {
		System.out.println("Using Default Sort");
		Collections.sort(data);
		
	}

	
	
}
