package MyPacakge;
import java.util.Scanner;
public class Large_number_ {

	public static void main(String[] args) {
		int max=0;
		Scanner sc=new Scanner(System.in);
		
		int a[]=new int[5];
		
		System.out.println("Enter Array Element:");
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
			
		}

		max=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
				max=a[i];
		}
		
		
		System.out.println("large element:"+max);
	}

}
