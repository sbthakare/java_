package Day4;

import java.util.Scanner;

public class Exception_handling {

	public static void main(String[] args) {

		 Scanner sc=new Scanner(System.in);
		 
		 int a,b,c;
		 int arr[]=new int[2];
		 
		 System.out.println("Enter Value of a & b:");
		 
		 a=sc.nextInt();
		 b=sc.nextInt();
		 
		 try
		 {
			 arr[0]=10;
			 arr[1]=arr[0]/b;
			  
			 c=a+b;
			 System.out.println("Addition="+c);
			 c=a/b;
			 System.out.println("Division="+c);
			 c=a*b;
			 System.out.println("Multiplication="+c);
		 }
		 catch(ArithmeticException obj)
		 {
			 System.out.println("Error! Divided by 0:");
			 System.out.println(obj);
		 }
		 catch(ArrayIndexOutOfBoundsException e)
		 {
			 System.out.println(e);
		 }
		
		 sc.close();
	}

	}


