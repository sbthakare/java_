package javalab;

public class PatternName {

	public static void main(String[] args) {
		int row=7;
		int col=7;
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				if(i==0||i==3||i==6)
					System.out.print("*");
				else if(j==0)
					System.out.print("*");
			}
			System.out.println();
		}
		

	}

}
