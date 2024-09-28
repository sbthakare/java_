package module3;

import java.util.Scanner;

public class IfDemo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a Number:");
		int num = sc.nextInt();

		if (num > 0)
			System.out.println("The Number  " + num + " is Positive");
		else if (num < 0)
			System.out.println("The Number " + num + "is Negative");
		else
			System.out.println("The Number is " + num);
		
		sc.close();
	}
    
}
