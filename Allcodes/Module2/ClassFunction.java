package module2;

public class ClassFunction {

	public static void main(String[] args) {
		System.out.println(Math.sqrt(144));
		System.out.println(Math.abs(-65)); // convert into +ve
		System.out.println(Math.min(20, 50));
		System.out.println(Math.max(30, 80));
		System.out.println(Math.random()); // generate no between 0 to 1

		double d = (int) (Math.random() * 100);
		System.out.println("d is " + d);

		System.out.println(Math.ceil(20.678));
		System.out.println(Math.floor(34.657));

		System.out.println(Math.addExact(20, 10)); // add numbers

		System.out.println(Math.PI);

		System.out.println(Math.TAU);
	}
}
