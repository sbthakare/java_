package javalab;

public class Pattern13 {

	public static void main(String[] args) {
		
		int row=6;
		int col=6;
		
		for(int i=1;i<=row;i++)
		{
			for(int j=col;j>=1;j--)
			{
				System.out.print(""+j);
				
			}
			col--;
			System.out.println();
		}
		
	}

}
