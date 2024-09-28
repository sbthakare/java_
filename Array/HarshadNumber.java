
/* 6.    Program to check Harshad number or not using Java
     Hint: - Harshad number is a number or an integer in base 10 which is completely divisible by sum of its digits.
     Example: Suppose a number 24. Calculate the sum of digits of the number   (2 + 4) = 6 .
     Check whether the number entered by user is completely divisible by    sum of its digits or not.
 
 */

package assignment_28;
import java.util.Scanner;
public class HarshadNumber {

	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        
        int originalNumber = number;
        int sumOfDigits = 0;

        
        while (number > 0) {
            int digit = number % 10;  
            sumOfDigits += digit;     
            number /= 10;             
        }

        
        if (originalNumber % sumOfDigits == 0) {
            System.out.println(originalNumber + " is a Harshad number.");
        } else {
            System.out.println(originalNumber + " is not a Harshad number.");
        }

	}

}
