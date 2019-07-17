package Prob2A;

public class Student {
	private String name;
	public GradeReport gradeReport;
	
	Student(String name) {
		this.name = name;
		this.gradeReport = new GradeReport(this);
	}
	
	Student(String name, GradeReport report) {
		this.name = name;
		this.gradeReport = report;
	}

	public String getName() {
		return name;
	}
}
