package Day4;
import java.util.Scanner;
public class Main_pg {

	
	public static void validate(int age)
	{
		if(age<18)
		{
			throw new ArithmeticException("person Not eligible for vote:");
		}
		else
		{
			System.out.println("person Is eligible for Vote:");
		}
	}
	
	
	public static void main(String[] args)
	  { 
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		
		validate(age);
		
		sc.close();

	}

}
