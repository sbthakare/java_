package javalab28;

import java.util.Scanner;

public class MaxElementArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int max = 0;
		System.out.println("How many Element You want Enter in Array:");
		int n = sc.nextInt();

		int A[] = new int[n];

		System.out.println("Enter " + n + " Elements:");

		for (int i = 0; i < A.length; i++) {
			System.out.println("Enter Element At A[" + i + "]=");
			A[i] = sc.nextInt();

			if (A[i] > max) {
				max = A[i];
			}
		}

		for (int i = 0; i < A.length; i++) {
			System.out.println("Array Elements:A[" + i + "]=" + A[i]);

		}
		System.out.println("max No From Array:" + max);

	}

}
