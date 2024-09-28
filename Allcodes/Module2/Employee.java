package module2;

import java.util.Scanner;

public class Employee {
	private int empNo;
	private String empName;
	private double empSalary;
	Scanner sc = new Scanner(System.in);

	public void accept() {
		System.out.println("enter the empNo:");
		empNo = sc.nextInt();

		System.out.println("enter the Name:");
		empName = sc.next();

		System.out.println("Enter salary:");
		empSalary = sc.nextDouble();
	}

	public void display() {
		System.out.println("empNo:" + empNo);
		System.out.println("empName:" + empName);
		System.out.println("empSalary:" + empSalary);
	}

	public void completeProject() {
		System.out.println(" Project Completed......!");
	}

	public void checkAttendence() {
		System.out.println(" 100 % Attendence ....!");
	}

	public void applyLoan() {
		System.out.println(" Loan Approved....!");
	}

	public void checkPerformance() {
		System.out.println("performance Is Good ..!");
	}

	public void checkSalary() {
		System.out.println("Salary =" + empSalary);
	}
}
