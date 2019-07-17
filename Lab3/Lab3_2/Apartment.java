package Lab3_2;

public class Apartment {
	String aptNo;
	double rent;
	Building build;
	
	Apartment(String aptNo, double rent) {
		this(aptNo, rent, null);
	}
	
	Apartment(String aptNo, double rent, Building build) {
		this.aptNo = aptNo;
		this.rent = rent;
		this.build = build;
	}
	
	public void setBuild(Building build) {
		this.build = build;
	}
}
