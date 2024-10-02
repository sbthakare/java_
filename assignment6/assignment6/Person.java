package assignment6;

final class Person {

	final private String name;
	final private int age;

	public Person() {
		super();
		name ="swapnil";
		age =23;
	}
	
	public String setName(String name)
	{
		return name;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}


	public static void main(String[] args) {
        Person person=new Person();
        System.out.println(person);
        person.setName("aman");
        
	}

}
