package Lab1;

import java.util.Date;

public class Feature {
	Developer developer;
	Date beginDate;
	float requiredDays;
	float remainingDays;
	String featureDescription;
	Boolean isCompleted;
	String id;
	
	Feature(String id, String desc, Developer dev, Date begin, float required) {
		this.id = id;
		this.featureDescription = desc;
		this.developer = dev;
		this.beginDate = begin;
		this.requiredDays = required;
		this.remainingDays = required;
		this.isCompleted = false;
	}
	
	public void updateRemainDate(int days) {
		remainingDays = days;
	}
	
	public void updateCompletedStatus() {
		isCompleted = true;
	}
}
