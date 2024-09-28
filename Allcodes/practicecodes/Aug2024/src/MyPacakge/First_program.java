package MyPacakge;

import java.util.Scanner;
public class First_program {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int a[];
		int i,even=0,odd=0;
		
		a=new int[5];
		
		System.out.println("Enter Element in Array:");
		
		for(i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
			if(a[i]%2==0)
			even+=a[i];
			else
			odd+=a[i];
		}
		
		System.out.println("Array Elements:");
		
		for(i=0;i<a.length;i++)
		{ 
			System.out.println("a["+i+"]="+a[i]);
		}
		
		System.out.println("EvenSum="+even);
		System.out.println("ODDSum="+odd);
	}

}
