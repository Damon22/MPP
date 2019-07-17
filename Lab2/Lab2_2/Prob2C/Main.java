package Prob2C;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		Student stu1 = new Student("Jipeng Gao");
		Student stu2 = new Student("Damon");
//		List<Student> stuList = new ArrayList();
		List<Student> stuList = Arrays.asList(stu1,stu2);
		try {
			Section sec = new Section(stuList);
			System.out.println(sec.sectionNum);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
