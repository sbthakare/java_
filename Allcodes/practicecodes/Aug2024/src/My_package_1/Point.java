package My_package_1;

class Point 
{
    private
		int a,b,c;
	
   void set_(int a,int b)
   {
	   this.a=a;
	   this.b=b;
	   c=a+b;
   }
	
	void show()
	{
		System.out.println("A="+a);
		System.out.println("B="+b);
		System.out.println("C="+c);
	}
	
	int comp()
	{
		return c;
	}
}
