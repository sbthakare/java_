package MyPacakge;

import java.util.Scanner;
public class positive_negative {
	public static void main(String[] args)
	{
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
				if(a[i]>0)
				{	b[j]=a[i];
				     j++;
				    
				}
		}
		
			
		System.out.println(" Element in Array :");
		
		for(int i=0;i<j;i++)
		{
			System.out.println("B["+i+"]="+b[i]);
		}	
		System.out.println("count:="+j);
	}

}
