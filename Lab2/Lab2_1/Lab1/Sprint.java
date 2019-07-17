package Lab1;

import java.util.Date;
import java.util.List;

public class Sprint {
	List<Feature> releaseFeatures;
	Date beginDate;
	Date dueDate;
	String id;
	
	Sprint(List<Feature> fs, Date begin, Date due, String id) {
		this.id = id;
		this.beginDate = begin;
		this.dueDate = due;
		this.releaseFeatures = fs;
	}
	
	public boolean checkFeatureStatus() {
		for (Feature f : releaseFeatures) {
			if (!f.isCompleted) return false;
		}
		return true;
	}
}
