package javalab;

public class Pattern11 {

	public static void main(String[] args) {
		int row=3;
		int col=6;
	    int space=2;
	    int dot=1;
	    int a=1;
	    for(int i=0;i<row;i++)
	    {
	    	for(int j=0;j<space;j++)
	    	{
	    		System.out.print(" ");
	    	}
	    	for(int k=0;k<dot;k++)
	    	{
	    		System.out.print(a+++" ");
	    		
	    	}
	       space--;
	       dot++;
	       System.out.println();

	}

	}

}
