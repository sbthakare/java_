package MyPacakge;

import java.util.Scanner;
public class Stored_alternative {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[5];
		int b[]=new int[5];
		int c[]=new int[10];
		
		
		
		
		System.out.println("Enter Element in Array 1:");
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}	
		
		System.out.println("Enter Element in Array 2:");
		
		for(int i=0;i<b.length;i++)
		{
			b[i]=sc.nextInt();
		}	
		
		
		int j=0;
		for(int i=0;i<c.length;i=i+2)
		{
				c[i]=a[j];
				j++;
		}
		 j=0;
		for(int i=1;i<c.length;i=i+2)
			{
				c[i]=b[j];
				j++;
			}
		
			
		System.out.println(" Element in Array 3:");
		
		for(int i=0;i<c.length;i++)
		{
			System.out.println("C["+i+"]="+c[i]);
		}	
		
	}

}
