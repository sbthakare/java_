package module5;

public class OverloadMain {

	
	 public void main()
	 {
		 System.out.println("Main method without Parameter");
	 }
	 
	 public void main(int a,int b)
	 {
		 System.out.println("Main method with 2 Parameters");
	 }
	 
	 public void main(int a)
	 {
		 System.out.println("Main method with 1 Parameter");
	 }
	public static void main(String[] args) {
		OverloadMain obj=new OverloadMain();
		obj.main();
		obj.main(10, 20);
		obj.main(20);

	}

}
