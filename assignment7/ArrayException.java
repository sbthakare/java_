package assignment7;
import java.util.Scanner;
public class ArrayException {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		
	    System.out.println("Enter Size of Array:");
	   int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter "+n+"Elements of Array:");
		
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		try {
				System.out.println(arr[10]);
		
		}catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e.getMessage());
			System.out.println(e);
		}

	}

}
