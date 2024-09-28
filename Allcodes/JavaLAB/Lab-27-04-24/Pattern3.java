package javalab;

public class Pattern3 {

	public static void main(String[] args) {
		int row=5;
		int col=1;
		
		for(int i=0;i<row;i++)    // outerloop
		{
			for(int j=0;j<col;j++)  //innerloop
			{
			 System.out.print("*"+" ");
			}
			col++;
			System.out.print("\n");
		}

	}

}
