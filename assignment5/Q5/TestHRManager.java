/* 
5.Implement Multilevel Inheritance with Method Overriding
    Create a base class Person.Create a subclass Employee that extends Person, and includes the methods work() and getSalary().
    Create another subclass HRManager that extends Employee, overrides the work() method, and adds a new method addEmployee() to simulate adding employees.
*/

package assignment_31;

public class TestHRManager {

	public static void main(String[] args) {
		
		HRManager hrmanager=new HRManager();
		
		hrmanager.getDetails();
		
		hrmanager.work();
		hrmanager.getSalary();
		
		hrmanager.work();
		hrmanager.addEmployee();
		
	}

}
