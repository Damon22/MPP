package Lab3_1;

public class PersonWithJob {
	
	public Person person;
	private double salary;
	
	public double getSalary() {
		return salary;
	}
	PersonWithJob(String n, double s) {
		person = new Person(n);
		salary = s;
	}
	
	@Override
	public boolean equals(Object aPerson) {
		if(aPerson == null) return false; 
		if(!(aPerson instanceof PersonWithJob)) return false;
		PersonWithJob p = (PersonWithJob)aPerson;
		boolean isEqual = this.person.equals(p.person) &&
				this.getSalary()==p.getSalary();
		return isEqual;
	}
	public static void main(String[] args) {
		PersonWithJob p1 = new PersonWithJob("Joe", 30000);
		Person p2 = new Person("Joe");
		//As PersonsWithJobs, p1 should be equal to p2
		System.out.println("p1.equals(p2)? " + p1.person.equals(p2));
		System.out.println("p2.equals(p1)? " + p2.equals(p1.person));
		
		/** Reason:
		 * p1.equals(p2) is false. 
		 * Because p1 is the instance of Class PersonWithJob, so p1.equals() will 
		 * call PersonWithJob's equals methods. And p2 is the instance of Person, so 
		 * p2.equals() will call Person's equals methods.
		 * */ 
	}


}
