package stringpackage;

public class StringBuilderDemo {

	public static void main(String[] args) {
		
		StringBuilder sb=new StringBuilder("Swapnil");
		
		sb.insert(7,"new text");
		System.out.println(sb);
		
		int i=sb.indexOf("p");
		System.out.println(i);
		
		int i1=sb.lastIndexOf("l");
		System.out.println(i1);
		
		
		i=sb.capacity();
		System.out.println(i);
		
		sb.deleteCharAt(2);
		System.out.println(sb);
		
		
		System.out.println(sb.hashCode());
		
		

	}

}
