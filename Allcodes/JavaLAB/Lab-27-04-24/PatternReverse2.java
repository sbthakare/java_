package javalab;

public class PatternReverse2 {

	public static void main(String[] args) {
		int row=5;
		int col=5;
		
		for(int i=row;i>0;i--)
		{
			for(int j=col;j>0;j--)
			{
				System.out.print(i+" ");
			}
			col--;
			System.out.println();

	}
	}

}
