package javalab28;

import java.util.Arrays;
import java.util.Scanner;

public class MinMaxInArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many Element You want Enter in Array:");
		int n = sc.nextInt();

		int[] A = new int[n];

		System.out.println("Enter " + n + " Elements:");

		for (int i = 0; i < A.length; i++) {

			A[i] = sc.nextInt();
		}
		Arrays.sort(A);
		System.out.println(Arrays.toString(A));
		System.out.println("Min Element:" + A[0]);
		System.out.println("Max Element:" + A[A.length-1]);

	}

}
