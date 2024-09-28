package module3;

import java.util.Scanner;

public class User {

	private String name;
	private int age;
	private double salary;

	Scanner sc = new Scanner(System.in);

	public void accept() {
		System.out.println("Enter Name,age,Salary:");
		name = sc.next();
		age = sc.nextInt();
		salary = sc.nextDouble();
	}

	public void checkAge() {
		if (age > 18)
			System.out.println("You are eligible for Vote");
		else if (age > 18 && age < 100)
			System.out.println("Your age is valid");
		else
			System.out.println("invalid age");
	}

	public void checkSalary() {
		if (salary > 0 && salary < 100000)
			System.out.println("salary is Valid");
		else
			System.out.println("Invalid salary");
	}

	public void display() {
		System.out.println("Name=" + name);
		System.out.println("age=" + age);
		System.out.println("Salary=" + salary);
	}
}
