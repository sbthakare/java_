package My_package_1;
import java.util.Scanner;
public class Employee 
{
	Scanner ob=new Scanner(System.in);
 private
   int empid,salary;
   String name;
   
  
   void set_Data()
   {   System.out.println("enter empid ,name & Salary:");
	   empid=ob.nextInt();
	   name=ob.next();
	   salary=ob.nextInt();
   }
   
   void show_Data()
   {
	   System.out.println("Employee ID:"+empid+"\t Name:"+name+"\t Salary:"+salary);
   }
   
   int comp()
   {
	   return (salary);
   }
   
}
