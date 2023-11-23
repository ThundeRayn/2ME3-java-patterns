package Adapters;

public class MedOfficeAdapter implements MedOffice{

	private ActualMedOffice office = new ActualMedOffice();
	
	@Override
	public void registerPatient(Patient patient) {
		
		office.registerPatient(patient.getName(), patient.getId());
	}

	@Override
	public void bookAppointment(Patient patient, Date date) {
		office.bookAppointment(patient.getId(), date.getDate());
		
	}

}
