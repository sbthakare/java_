package module6;

public class WrapperDemo {

	public static void main(String[] args) {
		String str="100";
		String str1="300";
		String str2="400.55";
		String str3="500.65";
		String str4="40.4f";
		String str5="50.3f";
		
		
		
		System.out.println("Total is:"+(Integer.parseInt(str)+Integer.parseInt(str1)));

		System.out.println("Total is:"+(Double.parseDouble(str2)+Double.parseDouble(str3)));
		
		System.out.println("Total is:"+(Float.parseFloat(str4)+Float.parseFloat(str5)));
		
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Byte.MIN_VALUE);
		System.out.println(Short.MAX_VALUE);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Long.MAX_VALUE);

	}

}

