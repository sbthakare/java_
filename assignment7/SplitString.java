package assignment7;
import java.util.StringTokenizer;
public class SplitString {

	
	public static void main(String[] args) {
		
		
		    public static void main(String[] args) {
		        String input = "Hello World";
		        
		        
		        StringTokenizer tokenizer = new StringTokenizer(input);

		        try {
		            
		            String firstWord = tokenizer.nextToken();
		            String secondWord = tokenizer.nextToken();
		            String extraCall = tokenizer.nextToken(); 
		            
		           
		            System.out.println("First word: " + firstWord);
		            System.out.println("Second word: " + secondWord);
		            System.out.println("Extra call: " + extraCall); 
		        } catch (Exception e) {
		            
		            System.out.println("An error occurred: " + e);
		        }
		    }
		}

	}

}
