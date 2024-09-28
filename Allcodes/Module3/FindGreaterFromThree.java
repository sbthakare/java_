package module3;
import java.util.Scanner;
public class FindGreaterFromThree {

	public static void main(String[] args) {
		
    Scanner sc=new Scanner(System.in);
    
    System.out.println("Enter Num1:");
    int num1=sc.nextInt();
    System.out.println("Enter Num2:");
    int num2=sc.nextInt();
    System.out.println("Enter Num3:");
    int num3=sc.nextInt();
    
    if(num1>num2 && num1>num3)
    	System.out.println("The Number "+num1+" is Greater.");
    else if(num2>num1 && num2>num3)
    	System.out.println("The Number "+num2+" is Greater.");
    else
    	System.out.println("The Number "+num3+" is Greater.");
	}

}
