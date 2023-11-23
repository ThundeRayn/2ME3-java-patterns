package Adapters;

public class RunnerAdapter {
    public static void main(String arg[]){
        Hospital hospital = new Hospital();
        Date date = new Date(1,11,2001);
        hospital.bookPatient(0, date);
    }
}
