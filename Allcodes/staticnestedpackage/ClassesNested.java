package staticnestedpackage;

class OuterClass {

	private static String msg = "Welcome to nested classes"; // mv

	public static class NestedClass {

		public void printMessage() {
			System.out.println(" Message from Nested static class:" + msg);
		}
	}

	public class InnerClass {
		public void display() {
			System.out.println(" Message from Non-static nested class"+ msg);
		}
	}

}

public class ClassesNested {

	public static void main(String[] args) {
		
		// 1 obj to call method for static
		OuterClass.NestedClass printer=new OuterClass.NestedClass();
	     printer.printMessage();
	     
	     // 2 obj to call method for non-static 
	     OuterClass outer =new OuterClass();
	     OuterClass.InnerClass inner=outer.new InnerClass();
	     inner.display();

	}

}
