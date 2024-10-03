package interfacepack;

public class Rectangle implements Graphics{
      float length;
      float width;
      
      
	public Rectangle(float length, float width) {
		super();
		this.length = length;
		this.width = width;
	}

	@Override
	public float area() {
		return (length*width);
	}

	@Override
	public float perimeter() {
		 
		return (2*(length+width));
	}

}
