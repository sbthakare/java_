package module6;

public class AutoBoxing {

	public static void main(String[] args) {
		
		int a=100;                // autoboxing
		Integer i=a;
		System.out.println(i.getClass());
		System.out.println(i.hashCode());
		
		
		
		int a1=i;                //Unboxing
		

	}

}
