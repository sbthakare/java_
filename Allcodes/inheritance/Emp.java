package inheritance;

public class Emp extends Student
{
 private int empid;
 private String company;
 private double salary;
public Emp(String name, int age, char gender, int rollNo, String stream, double score, int empid, String company,
		double salary) {
	super(name, age, gender, rollNo, stream, score);
	this.empid = empid;
	this.company = company;
	this.salary = salary;
}
 public void display()
 {
	super.display();
	
 }
public String toString() {
	return "Emp [empid=" + empid + ", company=" + company + ", salary=" + salary + ", rollNo=" + rollNo + ", stream="
			+ stream + ", score=" + score + ", name=" + name + ", age=" + age + ", gender=" + gender + "]";
}
 
 
 
 
}
