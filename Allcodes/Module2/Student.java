package module2;

import java.util.Scanner;

public class Student {
	private int rollNo;
	private String name;
	private double score;
	

	Scanner sc = new Scanner(System.in);

	public void accept() {
		System.out.println("Enter the RollNo:");
		rollNo = sc.nextInt();
		System.out.println("Enter the Name:");
		name = sc.next();
		System.out.println("Enter Score:");
		score = sc.nextDouble();
	}

	public void attendClass() {
		System.out.println("Attending the Class...");
	}

	public void apperExam() {
		System.out.println("Appering for the Exam....");
	}

	public void completeAssignment() {
		System.out.println("Completing the Assignments....");
	}

	public void Display() {
		System.out.println("RollNo=" + rollNo);
		System.out.println("Name=" + name);
		System.out.println("Score=" + score);
		
	}

}
