/*  pattern:
 
 		*****
 		*****
 		*****
 		*****
 		*****
*/
package javalab;

public class PrintStar {

	public static void main(String[] args) {
		int row=5;
		int col=5;
		
		for(int i=0;i<row;i++)    // outerloop
		{
			for(int j=0;j<col;j++)  //innerloop
			{
			 System.out.print("*");
			}
			System.out.print("\n");
		}
		
	}

}
