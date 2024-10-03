package stringpackage;

public class StringBufferDemo {

	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer("virat");
		StringBuffer sb1 = new StringBuffer("aAMAN");

		sb.append("Criketer");
		System.out.println(sb);

		
		int i=sb.indexOf("r");
		System.out.println("i is "+i);
		
		int i1=sb.lastIndexOf("k");
		System.out.println("i1 is "+i1);
		
		sb.replace(13, 15,"new");
		System.out.println(sb);
		
		sb.delete(0, 4);
		System.out.println(sb);
		
		System.out.println(sb.reverse());
		
		System.out.println(sb1.reverse());
	}

}
