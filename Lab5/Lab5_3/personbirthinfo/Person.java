package Lab5_3.personbirthinfo;

public final class Person {
	private String name;
	private BirthInfo birthInfo;
	
	Person(String name) {
		this.name = name;
	}
	
	public BirthInfo getBirthInfo() {
		return birthInfo;
	}
	
	public void setBirthInfo(BirthInfo birthInfo) {
		this.birthInfo = birthInfo;
	}
}
