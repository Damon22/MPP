package Prob2A;

public class GradeReport {
	
	public Student student;

	public GradeReport(Student student) {
		this.student = student;
	}

	public String toString() {
		return student.getName();
	}
}
