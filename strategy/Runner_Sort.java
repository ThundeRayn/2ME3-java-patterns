package strategy;

public class Runner_Sort {
    
    public static void main(String[] arg){
        SensorData sd = new SensorData();
        sd.addValue(-9);
        sd.addValue(1);
        sd.addValue(4);
        sd.addValue(6);
        sd.addValue(9);
        sd.addValue(54);
        sd.addValue(999);
        sd.addValue(-345);

        sd.setSort(new BubbleSorter());
        sd.sort();
        
    }
}
