package my_inheritance;

public class C1 extends B1
{
 private 
 
 float net,inc;
 
 public
 
 void get()
 {   
	 net=sal+Bonus;
	 inc=net*10/100;
 }
 
 void show()
 {  super.show();
	 System.out.println("net="+net);
	 System.out.println("inc="+inc);
 }
}
