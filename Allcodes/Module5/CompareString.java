package module5;

public class CompareString {

	public static void main(String[] args) {
		int a=100;
		int b=100;
		
		if(a==b)
			System.out.println("same");
		
		System.out.println("-------------------------");
		String str1="Name";
		String str2="Name";
		
		if(str1==str2)
			System.out.println("same");
		System.out.println("-------------------------");
		String str3=new String("check");
		String str4=new String("check");
		
		if(str3.equals(str4))
			System.out.println("same");
		System.out.println("-------------------------");
		
		if(str3.equals("Check"))
			System.out.println("same");
		
		System.out.println("-------------------------");
		
		String str5="Name";
		String str6="name";
		if(str5.equalsIgnoreCase(str6))
			System.out.println("same");
		

	}

}
