package module1;

public class Student {

	private int rollNo;
	private String name;
	private double score;
	
	
	public void attendClass() {
		System.out.println("Attending the Class...");
	}
	
	public void apperExam()
	{
		System.out.println("Appering for the Exam....");
	}
	
	public void completeAssignment()
	{
		System.out.println("Completing the Assignments....");
	}
	
	public void Display()
	{
		System.out.println("RollNo="+rollNo);
		System.out.println("Name="+name);
		System.out.println("Score="+score);
	}
	
	public static void main(String[] args) {
		
      Student student=new Student();
      student.name="aman";
      student.rollNo=01;
      student.score=89.99;
      student.Display();
      student.attendClass();
      student.apperExam();
      student.completeAssignment();
      
      System.out.println("----------------------------------");
      
      Student student2=new Student();
      student2.name="ajay";
      student2.rollNo=02;
      student2.score=99.99;
      student2.Display();
      student2.attendClass();
      student2.apperExam();
      student2.completeAssignment();
      
      System.out.println("-----------------------------------");
      
      Student student3=new Student();
      student3.name="atul";
      student3.rollNo=03;
      student3.score=79.99;
      student3.Display();
      student3.attendClass();
      student3.apperExam();
      student3.completeAssignment();
	}

}
