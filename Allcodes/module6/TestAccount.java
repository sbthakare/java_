package module6;

import java.util.Scanner;

public class TestAccount {

	public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);

			Account account = new Account();
			System.out.println("\t Default constructor");
			account.setAccNo(01);
			account.setAccName("swapnil");
			account.setAccBalance(1000000);
			System.out.println(account);

			System.out.println("-----------------------");
			System.out.println("\t Parameter constructor");

			
			System.out.println("Enter AccountNo: ");
			int accno=sc.nextInt();
			System.out.println("Enter Name: ");
			String name=sc.next();
			System.out.println("Enter Balance: ");
			double balance=sc.nextDouble();
			Account account1 = new Account(accno,name,balance);
			System.out.println("-----------------------------");

			System.out.println("\t Information");
			System.out.println(account1);


	}

}
