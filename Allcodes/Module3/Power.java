package module3;
import java.util.Scanner;
public class Power {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int rem,x,ans=1;
		System.out.println("Enter Number:");
		int num=sc.nextInt();
		
		 rem=num%10;
		 x=num/10;
	
		for(int i=0;i<rem;i++)
		{
			 ans=ans*x;
		}
		System.out.println("Ans="+ans);
	}

}
