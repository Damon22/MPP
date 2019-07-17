package Lab5_3.personbirthinfo;

public final class PersonAndBirthInfoImpl implements PersonAndBirthInfo {
	private Person person;
	private BirthInfo birthInfo;
	
	PersonAndBirthInfoImpl(Person person, BirthInfo birthInfo) {
		this.person = person;
		this.birthInfo = birthInfo;
	}
	
	@Override
	public Person getPerson() {
		return person;
	}
	
	@Override
	public BirthInfo getBirthInfo() {
		return birthInfo;
	}
	
}
