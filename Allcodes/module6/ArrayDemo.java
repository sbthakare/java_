package module6;

import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] arr = new int[5];
		System.out.println("Enter 5 Elements:");

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("---------------");
		// method 1 using normal for loop
		for (int i = 0; i < arr.length; i++) {
			System.out.println("A[" + i + "]=" + arr[i]);
		}

		System.out.println("---------------");
		// method 2:enhanced for loop

		for (int temp : arr) {
			System.out.println(temp);
		}
	}

}
