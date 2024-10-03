package module7;

class Shape {
	public void calArea(String shape, int a, int b) {
		System.out.println("calArea of shape class");
	}

	 void display() {
		System.out.println("display of shape class");
	}

	void fun1() {
		System.out.println("fun1 of shape class");
	}
}

class Rectangle extends Shape {

	public void calArea(String shape, int a, int b) {
		System.out.println("Rectangle Area:"+(a*b));
	}

       void display() {
		super.display();
		super.fun1();
	}

}

public class FunctionOverriding {

	public static void main(String[] args) {
		Shape shape = new Shape();
		shape.calArea("rect", 10, 20);
		shape.display();
		shape.fun1();

		System.out.println("---------------------");
		Rectangle rectangle = new Rectangle(); // Static binding
		rectangle.calArea("rect", 20, 30);
		rectangle.display();

		System.out.println("---------------------");
		shape = new Rectangle(); // dynamic binding
		shape.calArea("Rect", 20, 30); // call calArea or Rectangle class
		shape.display();
	}

}
