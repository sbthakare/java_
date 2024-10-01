/*
2.    Create a class to print the area of a square and a rectangle.The class has two methods ‘printArea’ and ‘printPerimeter’ with the same name 
but different number of parameters. The method for printing area of Rectangle has two parameters which are length and breadth respectively while 
the other method for printing area of square has one parameter which is side of square.
*/
package assignment_31;

public class Area {

		    void printArea(int side) {
		        System.out.println("Area of Square: " + (side * side));
		    }

		    void printPerimeter(int side) {
		        System.out.println("Perimeter of Square: " + (4 * side));
		    }

		    
		    void printArea(int length, int breadth) {
		        System.out.println("Area of Rectangle: " + (length * breadth));
		    }

		    void printPerimeter(int length, int breadth) {
		        System.out.println("Perimeter of Rectangle: " + (2 * (length + breadth)));
		    }
		
		

	}


