package javalab;

public class Pattern6 {

	public static void main(String[] args) {
		
		int row=5;
		int col=1;
		int a=1;
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print((a+i+j)+" ");
			    
			}
			col++;
			System.out.println();
			
		}

	}

}
