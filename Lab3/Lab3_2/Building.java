package Lab3_2;

import java.util.List;

public class Building {
	String buildNo;
	Landlord owner;
	List<Apartment> apartments;
	double maintenanceCost;
	
	Building(String buildNo, Landlord owner, 
			List<Apartment> aps, double maintenanceCost) {
		this.maintenanceCost = maintenanceCost;
		this.buildNo = buildNo;
		this.owner = owner;
		this.apartments = aps;
		updateApartmentInfo();
	}
	
	private void updateApartmentInfo() {
		for (Apartment apt : apartments) {
			apt.setBuild(this);
		}
	}
	
	public double getProfit() {
		float sum = 0;
		for (Apartment apt: apartments) {
			sum += apt.rent;
		}
		return sum - maintenanceCost;
	}
}
