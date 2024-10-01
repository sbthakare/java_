package emailvalidation;
										//email Validation
import java.util.Scanner;

public class EmailValidations {

	public void checkEmail(String email) 
	{
		int a = email.indexOf("@"); // if element not present it give -1

		int d = email.lastIndexOf(".");// if element not present it give -1

		if (a > -1 && d > -1 && a < d) {
			System.out.println("Valid Email");
		} else {
			System.out.println("Invalid Email");
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		EmailValidations emailValidations = new EmailValidations();
		System.out.println("enter the email");
		String email = sc.next();

		emailValidations.checkEmail(email); // call the CheckEmail() Function
	}

}
