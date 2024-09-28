package module5;

public class TestCircle {

	public static void main(String[] args) {
		Circle circle=new Circle();
		Circle circle2=new Circle();
		Circle circle3=new Circle();
		circle.accept();
		circle.calArea();
		circle.calPeri();
		circle.display();
		
        System.out.println(circle.hashCode());
        System.out.println(circle2.hashCode());   //hashCode
        System.out.println(circle3.hashCode());
        
        
        boolean result=circle.equals(circle3);
        System.out.println(result);
	}

}
