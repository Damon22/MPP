package Lab1;

import java.util.Date;
import java.util.List;

public class Project {
	List<Feature> backlog;
	List<Release> releases;
	String name;
	String id;
	
	Project(List<Feature> b, List<Release> r, String n, String id) {
		this.id = id;
		this.name = n;
		this.backlog = b;
		this.releases = r;
	}
	
	public int amountForCompleted() {
		int sum = 0;
		Date date = new Date();
		for (Release r : releases) {
			sum += r.checkCompletedSprint(date);
		}
		return sum;
	}
	
	public int amountForRemaining() {
		int sum = 0;
		Date date = new Date();
		for (Release r : releases) {
			sum += (r.sprints.size() - r.checkCompletedSprint(date));
		}
		return sum;
	}
}
