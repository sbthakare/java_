package javalab;

public class PrintChar {

	public static void main(String[] args) {
		
		char a='A';
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				System.out.print((char)(a+i+j)+" ");
			    
			}
			System.out.println();
			
		}

	}

}
