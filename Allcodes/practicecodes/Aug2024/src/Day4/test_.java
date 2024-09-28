package Day4;
import java.util.Scanner;
public class test_ {

	public static void main(String[] args) 
	{
	 Scanner sc=new Scanner(System.in);
	 
	 int a,b,c = 0,d;
	 
	 System.out.println("Enter Value of a & b:");
	 
	 a=sc.nextInt();
	 b=sc.nextInt();
	 
	 
	 try
	 {
		 c=a+b;
		 System.out.println("Addition="+c);
		 c=a/b;
		 System.out.println("Division="+c);
		 c=a*b;
		 System.out.println("Multiplication="+c);
	 }
	 catch(Exception obj)
	 {
		 System.out.println("Error! Divided by 0:");
	 }
	 
	 finally
	 {
     d=a+b+c;
     System.out.println("D="+d);
	 }
	 sc.close();
}
}
