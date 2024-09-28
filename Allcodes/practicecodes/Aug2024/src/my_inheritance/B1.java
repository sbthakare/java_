package my_inheritance;

public class B1 extends A1
{
  protected int Bonus;
  
  
  public
  
  void get2(int b)
  { 
	 
	  Bonus=b;
  }
  void show()
  { super.show();
	  System.out.println("Bonus="+Bonus);
	 
  }
}
