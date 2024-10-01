package assignment_31;

public class TestStudent {

	public static void main(String[] args) {

        Student[] students = new Student[10];

        
        for (int i = 0; i < students.length; i++) {
            students[i] = new Student(); 
        }

        
        students[0].setInfo("Ajay", 20);
        students[1].setInfo("Amar", 22, "Nashik");
        students[2].setInfo("Akash", 21, "Nashik");
        students[3].setInfo("Swapnil", 23);
        students[4].setInfo("kohli", 20, "punjab");
        students[5].setInfo("john", 24);
        students[6].setInfo("rahul", 25, "dehli");
        students[7].setInfo("Rishabh", 22);
        students[8].setInfo("rohit", 23, "");
        students[9].setInfo("dhoni", 21);

        
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }
    }
	}