package inheritance;

public class TestPerson {

	public static void main(String[] args) {
		Person person = new Person("Aman", 20, 'M');
		System.out.println(person);
		person.display();
		person.fun1();
		System.out.println("---------------------------");
		
		Student student=new Student("Aman",20, 'M',01,"computer",80.7);
		System.out.println(student);
		student.display();
		System.out.println("---------------------");
		
		Emp emp=new Emp("Raj",35,'M',02,"computer",79.6, 5,"Infosys",50000);
		System.out.println(emp);
		emp.display();
		
		
		System.out.println("----------------------------");
		person=new Student("Aman",20, 'M',01,"computer",80.7);
		System.out.println(person);
		
		System.out.println("----------------------");
		person=new Emp("Raj",35,'M',02,"computer",79.6, 5,"Infosys",50000);
	}

}
