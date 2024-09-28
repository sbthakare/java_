package module1;

public class Employee 
{
  private int emp_id;
  private String name;
  private int dob,doj,bonus,count;
  private double salary;
  
  public void setValue(int eid,String n,int date_of_birth ,int date_of_joining,double sal )
  {
	  emp_id=eid;
	  name=n;
	  dob=date_of_birth;
	  doj=date_of_joining;
	  salary=sal;
  }
  
  public void display()
  {
	  System.out.println("Employee_id="+emp_id);
	  System.out.println("Name="+name);
	  System.out.println("Date_of_Birth="+dob);
	  System.out.println("Date_of_joining="+doj);
	  System.out.println("Salary="+salary);
  }
  
  public void addBonus()
  {
	  salary=salary+bonus;
	  System.out.println("After Adding Bonus Salary="+salary);
  }
  
  public void assignTask()
  {
	  System.out.println("Task is Assign.....!");
  }
  
  public void getLeave()
  {
	  System.out.println("Leave Granted....");
  }
  public void get_count_Emp()
  {
	   count++;
	   System.out.println("Count="+count);
  }
  public static void main(String args[])
  {
	  Employee employee=new Employee();
	  employee.setValue(100,"Bill Gates", 5/03/1985, 25/03/2024, 300000);
	  employee.display();
	  employee.addBonus();
	  employee.assignTask();
	  employee.getLeave();
	  employee.get_count_Emp();
	  System.out.println(10 > 5 && 5 < 3);
	  System.out.println("----------------------------");
	  
	  Employee employee2=new Employee();
	  employee2.setValue(101,"james Goslin", 06/07/1955, 25/03/2024, 3000000);
	  employee2.display();
	  employee2.addBonus();
	  employee2.assignTask();
	  employee2.getLeave();
	  employee2.get_count_Emp();
	  
	  System.out.println("----------------------------");
	  
  }
}
