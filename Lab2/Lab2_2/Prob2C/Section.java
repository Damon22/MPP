package Prob2C;

import java.util.List;

public class Section {
	public int sectionNum;
	public List<Student> students;
	
	Section(List<Student> students) throws Exception {
		if (students.size() == 0) throw new Exception("Must has one student.");
		this.students = students;
		this.sectionNum = students.size();
	}
	
}
