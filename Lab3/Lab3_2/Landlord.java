package Lab3_2;

import java.util.List;

public class Landlord {
	public String name;
	List<Building> buildings;
	
	Landlord(String name) {
		this(name, null);
	}
	
	Landlord(String name, List<Building> builds) {
		this.name = name;
		this.buildings = builds;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setBuildings(List<Building> builds) {
		this.buildings = builds;
	}
	
	public double getProfit() {
		float sum = 0;
		for (Building build: buildings) {
			sum += build.getProfit();
		}
		return sum;
	}
}
