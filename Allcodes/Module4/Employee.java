package module4;

import java.util.Scanner;

public class Employee {
	private int empNo;
	private String ename;
	private double bal;

	Scanner sc = new Scanner(System.in);

	public void accept() {
		System.out.println("Enter empNo,ename,Balance:");
		empNo = sc.nextInt();
		ename = sc.next();
		 bal = sc.nextDouble();
	}

	public void checkEmpNo() {
		if(empNo>0)
			System.out.println("valid Employee Number");
		else
			System.out.println("Invalid Employee Number");
	}

	public void checkBal() {
		if (bal> 0 && bal < 100000)
			System.out.println("Valid balance");
		else if(bal<100000)
			System.out.println("produce the Proof");
		else
			System.out.println("invalid Balance");
	}

	public void display() {
		System.out.println("empNo=" +empNo);
		System.out.println("ename=" +ename);
		System.out.println("Balance="+bal);
	}
}
