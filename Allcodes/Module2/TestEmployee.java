package module2;

public class TestEmployee {

	public static void main(String[] args) {
		Employee employee = new Employee();

		employee.accept();
		employee.display();
		employee.completeProject();
		employee.checkAttendence();
		employee.applyLoan();
		employee.checkPerformance();
		employee.checkSalary();

		System.out.println("-----------------------------------");

		Employee employee2 = new Employee();
		employee2.accept();
		employee2.display();
		employee2.completeProject();
		employee2.checkAttendence();
		employee2.applyLoan();
		employee2.checkPerformance();
		employee2.checkSalary();

		System.out.println("-----------------------------------");

		Employee employee3 = new Employee();
		employee3.accept();
		employee3.display();
		employee3.completeProject();
		employee3.checkAttendence();
		employee3.applyLoan();
		employee3.checkPerformance();
		employee3.checkSalary();

	}

}
