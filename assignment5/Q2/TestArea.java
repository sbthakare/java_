package assignment_31;

public class TestArea {

	public static void main(String[] args) {
		Area area=new Area();

        // For Square
        int side = 5;
        area.printArea(side);
        area.printPerimeter(side);

        // For Rectangle
        int length = 10, breadth = 5;
        area.printArea(length, breadth);
        area.printPerimeter(length, breadth);

	}

}
