package module6;
import java.util.Scanner;
public class MultiArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[][] arr=new int[3][4];
		
		
		System.out.println("Enter 12 Values");
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<4;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("______________________________________");
		System.out.println("rollNo \t C++ \t java \t Mysql");
		System.out.println("________________________________________");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<4;j++)
			{
				System.out.print(arr[i][j]+"   \t");
			}
			System.out.println();
		}

	}

}
