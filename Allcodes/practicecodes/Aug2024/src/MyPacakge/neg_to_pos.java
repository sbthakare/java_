package MyPacakge;

import java.util.Scanner;

public class neg_to_pos {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[]=new int[5];
		int count=0;

		System.out.println("Enter Element in Array:");
		
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
			
			if(a[i]<0) 
			{
				a[i]=0;
				count++;
			}
			
		}	
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println("A["+i+"]="+a[i]);
		}	
		
		System.out.println("count="+count);
	}

}
