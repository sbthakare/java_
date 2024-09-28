package day_4_3;

public class FE 
{
  private
  String name;
  int roll,sub1,sub2,sub3;
  
 protected float ftotal;
  
  
  public 
  
  void get(String n,int r,int s1,int s2,int s3)
  {
     name=n;
     roll=r;
     sub1=s1;
     sub2=s2;
     sub3=s2;
     
     ftotal=sub1+sub2+sub3;
  }
  
  void show()
  {
	  System.out.println("Name:"+name);
	  System.out.println("RollNo:"+roll);
	  System.out.println("sub1:"+sub1);
	  System.out.println("Sub2:"+sub2);
	  System.out.println("sub3:"+sub3);
	  System.out.println("Ftotal:"+ftotal);
  }
  
}
