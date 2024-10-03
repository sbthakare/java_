package inheritance;

public class TestMatch {

	public static void main(String[] args) {
		T20 t20 = new T20("31/09/2024", "india", 20, "rohit", "wankhede");
		t20.display();
		System.out.println(t20);

		Odi odi = new Odi("31/09/2024", "India", 50, 8);
		odi.display();
		System.out.println(odi);

		Test test = new Test("31/09/2024", "India", 100, "red", 5);
		test.display();
		System.out.println(test);

	}

}
