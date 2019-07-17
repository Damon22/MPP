package Lab5_3.personbirthinfo;

import java.time.LocalDate;

public final class PersonBirthInfoFactory {
	private PersonBirthInfoFactory() {}
	
	public PersonAndBirthInfo createPersonAndBirthInfo(LocalDate dateOfBirth, String name) {
		Person p = new Person(name);
		BirthInfo b = new BirthInfo(dateOfBirth);
		p.setBirthInfo(b);
		b.setPerson(p);
		return new PersonAndBirthInfoImpl(p, b);
	}
}
