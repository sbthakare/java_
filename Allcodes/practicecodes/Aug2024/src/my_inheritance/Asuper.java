package my_inheritance;

public class Asuper
{
	private int a;
	private int b;
	protected int c;
	
  public
  void get(int x,int y)
  {
	  a=x;
	  b=y;
	  c=a+b;
  }
  void show() 
  {
	  System.out.println("C="+c);
  }
}
