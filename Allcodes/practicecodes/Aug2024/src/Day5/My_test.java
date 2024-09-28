package Day5;

 interface myinter
{
  void Show_();
}

public class My_test extends Test implements myinter
{
    
	public void show()
	{
		 super.show();
		System.out.println("My Test Class");
	}
	
	public void Show_()
	{
		System.out.println("Interface Working:");
	}
}
