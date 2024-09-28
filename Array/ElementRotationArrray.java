
/* 9.  Java program for rotation of elements of array- left and right. An array is said to be right
rotated if all the selected elements were moved towards right by one position.*/

package assignment_28;
import java.util.Arrays;
import java.util.Scanner;
public class ElementRotationArrray {

	
	
    static void rightRotate(int[] arr) {
        int last = arr[arr.length - 1];  
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];  
        }
        arr[0] = last;  
    }

    static void leftRotate(int[] arr) {
        int first = arr[0];  
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];  
        }
        arr[arr.length - 1] = first;  
    }
    
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Original array: " + Arrays.toString(arr));
            
        String ch=" ";
        
        
        do {
        	System.out.println("Enter 1 :for left rotation");
        	System.out.println("      2 :for right rotation:");
            int choice = sc.nextInt();
        	switch(choice)
        	{
        	case 1:
        		leftRotate(arr);
                System.out.println("Array after left rotation: " + Arrays.toString(arr));
                break;
                
        	case 2:
        		rightRotate(arr);
                System.out.println("Array after right rotation: " + Arrays.toString(arr));
                break;
             default:System.exit(0);
        	}
        	System.out.println("Do You want To continue:(Y/N):");
        	ch=sc.next();
        }while(ch.equalsIgnoreCase("Y"));
	}

}
