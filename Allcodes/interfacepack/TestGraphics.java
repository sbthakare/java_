package interfacepack;

public class TestGraphics {

	public static void main(String[] args) {
		Circle circle=new Circle(5);
		System.out.println("Area of Circle:"+circle.area());
		System.out.println("Perimeter of Circle:"+circle.perimeter());
		
		
		Rectangle rectangle=new Rectangle(3, 4);
		System.out.println("Area of Rectangle:"+rectangle.area());
		System.out.println("Perimeter of Rectangle:"+rectangle.perimeter());
	}

}
