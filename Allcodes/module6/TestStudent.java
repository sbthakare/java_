package module6;

import java.util.Scanner;

public class TestStudent {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter RollNo,Name,Score:");
		int rollno = sc.nextInt();
		String name = sc.next();
		double score = sc.nextDouble();

		Student student = new Student();
		student.setRollno(rollno);
		student.setName(name);
		student.setMark(score);

		// student.display();
		System.out.println("Displaying Details:");
		System.out.println("Roll No is " + student.getRollno());
		System.out.println("Name is " + student.getName());
		System.out.println("Score is " + student.getMark());
		student.markAttendence();

		System.out.println("-----------------");

		Student student1 = new Student(01, "Swapnil", 96);
		// student1.display();
		System.out.println("Displaying Details:");
		System.out.println("Roll No is " + student1.getRollno());
		System.out.println("Name is " + student1.getName());
		System.out.println("Score is " + student1.getMark());
		student1.markAttendence();

		System.out.println("--------------------------");
		System.out.println("Changing the name");
		System.out.println("Enter new name.");
		String name1 = sc.next();

		student1.setName(name1);
		System.out.println("New Name is " + student1.getName());
	}

}
