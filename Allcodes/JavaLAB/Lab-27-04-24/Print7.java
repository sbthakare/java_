package javalab;

public class Print7 {

	public static void main(String[] args) {
		int row=5;
		int col=1;
		
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=col;j++)
			{
				System.out.print((i)%2+" ");
			    
			}
			col++;
			System.out.println();
			
		}


	}

}
