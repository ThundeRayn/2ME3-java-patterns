package Adapters;

public interface MedOffice {
	public void registerPatient(Patient patient);
	public void bookAppointment(Patient patient, Date date);
	
}
