package module5;

public class UpwardCasting {

	public static void main(String[] args) {
		int a = 10;
		double d = a; // upward Casting :Automatically
		System.out.println(d);

		double d1 = 50.99;
		int i = (int) d1; // down Casting :explicit
		System.out.println(i);
	}

}
