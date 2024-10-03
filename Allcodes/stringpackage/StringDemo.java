package stringpackage;

public class StringDemo {

	public static void main(String[] args) {
		
          String str=new String("swapnil:Babanrao:Thakare");
          String str2=new String("     thakare");
          
          System.out.println(str.substring(5));
          System.out.println(str.substring(5, 8));
          
          System.out.println(str.trim());
          System.out.println(str.toUpperCase());
          
          System.out.println(str.toLowerCase());
          System.out.println(str.trim().toLowerCase()); // removespace & lowercase
          
          System.out.println(str.indexOf("B"));
          
          System.out.println(str2.replace("a","aa"));
          
          System.out.println(str.concat(str2));
          
          if(str.equals(str2))
        	  System.out.println("same");
          
          String[] arr=str.split(":");  //split the string from :
          
          for(String s:arr) {
        	  System.out.println(s);
          }
          
          
          System.out.println(str2.trim());
          
          
	}

}
