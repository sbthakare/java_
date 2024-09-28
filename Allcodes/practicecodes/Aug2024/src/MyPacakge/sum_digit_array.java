package MyPacakge;

import java.util.Scanner;

public class sum_digit_array {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[]=new int[5];
		int b[]=new int[5];
		

		System.out.println("Enter Element in Array:");
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
			
		}	
		int j=0;
		for(int i=0;i<a.length;i++)
		{
			int sum=0;
			while(a[i]>0)
			{
				sum+=a[i]%10;
				a[i]=a[i]/10;
				
			}
			b[j]=sum;
			j++;
		}
		
System.out.println(" Array:");
		
		for(int i=0;i<b.length;i++)
		{
			System.out.println("b["+i+"]="+b[i]);
			
		}	
	}

}
