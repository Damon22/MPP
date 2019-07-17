package Lab1;

import java.util.Date;
import java.util.List;

public class Release {
	List<Sprint> sprints;
	Date releaseDate;
	String version;
	
	Release(List<Sprint> s, String v, Date release) {
		this.sprints = s;
		this.version = v;
		this.releaseDate = release;
	}
	
	public int checkCompletedSprint(Date date) {
		int sum = 0;
		for (Sprint s : sprints) {
			sum += (s.checkFeatureStatus() ? 1 : 0);
		}
		return sum;
	}
}
