package module3;

import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number:");
		int num = sc.nextInt();

		switch (num) {
		case 5:
			System.out.println("Movie Time:");
			break;
		case 6:
			System.out.println("Super sat");
			break;
		case 7:
			System.out.println("Sleepy Sun");
			break;
		case 1, 2, 3, 4:
			System.out.println("working day");
			break;
		default:
			System.out.println("you Enter Wrong choice!");

		}

	}

}
