package Lab1;

import java.util.List;

public class Developer extends Employee {
	
	List<Feature> features;
	
	Developer(String firstName, String lastName, String id) {
		super(firstName, lastName, id);
		// TODO Auto-generated constructor stub
	}
	
	public void estimate() {
		for (Feature f : features) {
			f.updateCompletedStatus();
			f.updateCompletedStatus();
		}
	}
}
