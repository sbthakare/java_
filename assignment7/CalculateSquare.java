package assignment7;
import java.util.Scanner;

public class CalculateSquare {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		
		try {
			System.out.println("Enter the Number:");
			double num=sc.nextDouble();
			System.out.println("Square="+num*num);
			
		}
		catch(Exception e)
		{
			//System.out.println(e);
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		

	}

}
