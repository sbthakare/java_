package module6;

public class Student {

	private int rollno;
	private String name;
	private double mark;

	public Student() { // shortcut-> ctr+spacebar+enter
		// System.out.println("Default Constructor");
		this.rollno = rollno;
		this.name = name;
		this.mark = mark;

	}

	public Student(int rollno, String name, double mark) {
		super();//calls the parent class constructor
		// shortcut->rightclick->source->generate constructor using field
		this.rollno = rollno;
		this.name = name;
		this.mark = mark;
	}

	// create getter/setter= rightclick->source->generate getter/setter
	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMark() {
		return mark;
	}

	public void setMark(double mark) {
		this.mark = mark;
	}

//	public void display() {
//		System.out.println("RollNo:" + rollno);
//		System.out.println("Name:" + name);
//		System.out.println("Mark:" + mark);
//	}

	public void markAttendence() {
		System.out.println("Attendence Marking..");
	}
}
