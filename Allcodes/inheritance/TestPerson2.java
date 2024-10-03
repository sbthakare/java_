package inheritance;

public class TestPerson2 {
// creating Array with object
	public static void main(String[] args) {

		Person[] arr = new Person[5];

		arr[0] = new Person("Swapnil", 22, 'M');
		arr[1] = new Person("aman", 23, 'M');
		arr[2] = new Person("Pratima", 22, 'F');
		arr[3] = new Person("Kartik", 25, 'F');
		arr[4] = new Person("Diya", 23, 'F');

		for (int i = 0; i < arr.length; i++) {
			// System.out.println(arr[i]);
			System.out.println(
					arr[i].getName() + " is " + arr[i].getAge() + " yrs old and gender is " + arr[i].getGender()
					);
		}

	}

}
