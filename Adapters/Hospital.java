package Adapters;

public class Hospital {

	private Patient[] currentPatients = new Patient[100];
	private MedOffice requester;
	
	public void bookPatient(int index, Date date) {
		requester.registerPatient(currentPatients[index]);
		requester.bookAppointment(currentPatients[index], date);
	}
	
}
