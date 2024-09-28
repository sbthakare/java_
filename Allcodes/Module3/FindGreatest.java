package module3;
import java.util.Scanner;
public class FindGreatest {

	public static void main(String[] args) {
		
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Num1:");
    int num1=sc.nextInt();
    System.out.println("Enter Num2:");
    int num2=sc.nextInt();
    
	if(num1>num2)
		System.out.println("The Number "+num1+" is Greater");
	else if(num1<num2)
		System.out.println("The Number "+num2+" is Greater");
	else
		System.out.println("The Numbers Are Equals.");
	
	sc.close();
    
	}

}
