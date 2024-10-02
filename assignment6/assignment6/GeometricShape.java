package assignment6;

abstract class GeometricShape
{
	
	abstract void area();
	abstract void perimeter();
	

}

class circle extends GeometricShape
{    
	private int r;
	
	public circle(int r) {
		super();
		this.r = r;
	}

	public void area()
	{
		System.out.println("Area Circle "+(3.14*r*r));
	}
	
	public void perimeter()
	{
		System.out.println("perimeter circle "+(2*3.14*r));
	}


}


class Rectangle extends GeometricShape
{   private int l;
    private  int b;
    
    
	public Rectangle(int l, int b) {
		super();
		this.l = l;
		this.b= b;
	}

	public void area()
	{
		System.out.println("Area Rectangle "+(l*b));
	}
	
	public void perimeter()
	{
		System.out.println("perimeter rectangle "+(2*(l+b)));
	}
		
}

class Triangle extends GeometricShape
{
	
	private int side;
	private int h;
	
	
	public Triangle(int side,int h) {
		super();
		this.side = side;
		this.h=h;
	}

	public void area()
	{
		System.out.println("Area Triangle "+(0.5*side*h));
	}
	
	public void perimeter()
	{
		System.out.println("perimeter Triangle "+(side+side+side));
	}


}
