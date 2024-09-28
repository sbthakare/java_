package my_inheritance;

public class A1 
{
  private
  int empid;
  String name;
  protected float sal;
  
  public
  
  void get1(int id,String n,float s)
  {
	  empid=id;
	  name=n;
	  sal=s;
  }
  
  
  void show()
  {
	  System.out.println("empid="+empid);
	  System.out.println("name="+name);
	  System.out.println("sal="+sal);
	  
  }
}
