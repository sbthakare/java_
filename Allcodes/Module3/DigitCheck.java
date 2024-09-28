package module3;
import java.util.Scanner;
public class DigitCheck {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Number:");
		int num=sc.nextInt();
		
		 if(num>=0 && num<10)
			System.out.println("Number is 1 Digit.");
		else if(num>9 && num<100)
			System.out.println("number is 2 Digit.");
		else if(num>99 && num<1000)
			System.out.print("number is 3 Digit.");
		else if (num>999 && num<10000)
			System.out.println("number is 4 Digits.");
		else
			System.out.println("number is Greater than 4 Digits.");
	}

}
