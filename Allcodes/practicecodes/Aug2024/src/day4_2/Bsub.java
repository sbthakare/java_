package day4_2;

public class Bsub extends Asuper
{
  private 
  int p,q;
  
  public
  
  Bsub(int a1,int b1,int x1,int y1)
  {
	  super(a1,b1);
	  
	  p=x1;
	  q=y1;
  }
  
  void show_() 
  {  super.show_();
	  System.out.println(p);
	  System.out.println(q);
  }
}
