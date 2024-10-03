package interfacepack;

public class Circle implements Graphics{
      float radius;
      
	public Circle(float radius) {
		super();
		this.radius = radius;
	}

	@Override
	public float area() {
		return (3.14f*radius*radius);
	}

	@Override
	public float perimeter() {
		
		return (2*3.14f*radius);
	}

}

