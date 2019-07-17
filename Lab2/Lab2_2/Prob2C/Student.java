package Prob2C;

import java.util.List;

public class Student {
	public String name;
	public List<Section> sections;
	
	Student(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setSections(List<Section> sections) {
		this.sections = sections;
	}
	
	public List<Section> getSections() {
		return sections;
	}
}
