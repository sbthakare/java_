package assignment7;
import java.util.Scanner;
public class StringConvertInterger {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String:");
		String str=sc.next();
		try {
			
			int a=Integer.parseInt(str);
			System.out.println("Interger value:"+a);
		}
		catch(NumberFormatException e)
		{
			System.out.println(e);
		}
	}

}
