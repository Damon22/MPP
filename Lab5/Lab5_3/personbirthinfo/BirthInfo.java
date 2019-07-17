package Lab5_3.personbirthinfo;

import java.time.LocalDate;

public final class BirthInfo {
	private LocalDate dateOfBirth;
	private Person person;
	
	BirthInfo(LocalDate dob) {
		dateOfBirth = dob;
	}
	
	public void setPerson(Person p) {
		this.person = p;
	}
	
	public Person getPerson() {
		return person;
	}
	
}
