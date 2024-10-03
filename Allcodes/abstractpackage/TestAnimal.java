package abstractpackage;

abstract  class Animal{
	
	final static protected int legs=4;
	
	abstract public void sounds();
	abstract public void fun1();
	abstract public void fun2();
	
	public void classInfo(String type)
	{
		System.out.println("I belongs to "+type+" has "+legs+" legs.");
	}
	
}

 class Dog extends Animal
{
	public void sounds()
	{
		System.out.println("The lion..");
	}
	
	public void fun1()
	{
		System.out.println("The fun1 of Dog");
	}
	public void fun2()
	{
		System.out.println("The fun2 of Dog");
	}
}

  class Lion extends Animal
{
	public void sounds()
	{
		System.out.println("The lion..");
	}
	
	public void fun1()
	{
		System.out.println("The fun1 of Lion");
	}
	public void fun2()
	{
		System.out.println("The fun2 of Lion");
	}
}

public class TestAnimal {
 public static void main(String args[])
 {
	 Dog dog=new Dog();
	 dog.classInfo("Dog");
	 dog.sounds();
	 dog.fun1();
	 dog.fun2();
	 
	 System.out.println("-------------------------");
	 
	 Lion lion=new Lion();
	 lion.classInfo("Lion");
	 lion.sounds();
	 lion.fun1();
	 lion.fun2();
 }
}
