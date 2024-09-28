package module5;

public class OverloadingStatic {

	static public int add(int a, int b) {
		return (a + b);
	}

	static public int add(int a, int b, int c) {
		return (a + b + c);
	}

	static public double add(int a, double b) {
		return (a + b);
	}

	public static void main(String[] args) {
		// we did not create an obj to call the static method

		int result = OverloadingStatic.add(10, 20);    // also call with Classname.methodname()
		System.out.println(result);

		int result1 = add(10, 20, 30);
		System.out.println(result1);

		double result3 = add(20, 40.5);
		System.out.println(result3);

	}

}
