
//8.  Java program to count numbers of even and odd elements in an array
package assignment_28;
import java.util.Scanner;
public class CountEvenOdd {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Size of Array:");
		int n=sc.nextInt();
		int counteven=0;
		int countodd=0;
		int arr[]=new int[n];
		
		System.out.println("Enter"+n+" Array elements:");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
			
			if(arr[i]%2==0)
			{
				counteven++;
			}
			else
			{
				countodd++;
			}
		}
		System.out.println("Even Count;"+counteven);
		System.out.println("Odd Count:"+countodd);
		
	}

}
