package javalab;

public class PatternPrinting {

	public static void main(String[] args) {
		int row=6;
		int col=6;
		int space=0;
		int star=5;
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<space;j++)
			{
				System.out.print(" ");
			}
			
			for(int k=0;k<star;k++)
			{
				System.out.print("*"+"");
			}
			space++;
			star--;
			System.out.println();
		}
	}

}
