package Lab3_2;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		Landlord landlord = new Landlord("Jipeng Gao");
		
		List<Apartment> aps = new ArrayList<>();
		aps.add(new Apartment("101", 5000));
		aps.add(new Apartment("102", 6000));
		aps.add(new Apartment("103", 7000));
		aps.add(new Apartment("201", 8000));
		aps.add(new Apartment("202", 4000));
		aps.add(new Apartment("203", 5500));
		
		List<Building> builds = new ArrayList<>();
		builds.add(new Building("001", landlord, aps, 10000));
		
		landlord.buildings = builds;
		System.out.println("The profit is " + landlord.getProfit());
	}

}
