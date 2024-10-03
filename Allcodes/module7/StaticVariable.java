package module7;

public class StaticVariable {
		static int num=1;
		
		public void display()
		{
			num++;
			System.out.println(num);
		}
	public static void main(String[] args) {
//		System.out.println(num);
//		System.out.println(StaticVariable.num);  // 1st method
		
		
		StaticVariable staticvariable=new StaticVariable(); //2nd method
		staticvariable.display();
	}

}
