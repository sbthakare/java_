package javalab;

public class Pattern9 {

	public static void main(String[] args) {
		int row=4;
		int col=8;
	    int space=4;
	    int dot=1;
	    
	    for(int i=0;i<row;i++)
	    {
	    	for(int j=0;j<space;j++)
	    	{
	    		System.out.print(" ");
	    	}
	    	for(int k=0;k<dot;k++)
	    	{
	    		System.out.print("*"+" ");
	    	}
	       space--;
	       dot++;
	       System.out.println();
	    	
	    }

	}

}
