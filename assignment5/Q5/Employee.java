package assignment_31;

public class Employee extends Person {
	public void getDetails() {
		super.getDetails();
		System.out.println("I am an employee.");
	}

	public void work() {
		System.out.println("Employee is working.");
	}

	public void getSalary() {
		System.out.println("Employee salary is 50,000.");
	}
}
