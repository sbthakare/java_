package userinterface;

import java.util.Scanner;

import entity.Account;
import operations.AccountOperations;

public class TestAccount {

	public static void main(String[] args) {

		int ch;
		String choice;
		Scanner sc = new Scanner(System.in);

		Account account1 = new Account(1, "Rohit", 30000);
		Account account2 = new Account(2, "Kohli", 40000);

		AccountOperations accountoperations = new AccountOperations();

		do {

			System.out.println("\t   ICICI BANK");
			System.out.println("\t 1.Accept Details");
			System.out.println("\t 2.Display Details");
			System.out.println("\t 3.Withdraw Amount");
			System.out.println("\t 4.Deposit Amount");
			System.out.println("\t 5.Transfer Amount");
			System.out.println("\t 6.Check Balance");
			System.out.println("\t 7.Update Balance");
			System.out.println("\t 8.Exit");

			System.out.println("__________________________________");
			System.out.println("Enter Your Choice:");
			ch = sc.nextInt();

			switch (ch) {
			case 1:
				System.out.println("Accepting Details...");

				break;

			case 2:
				System.out.println("Displaying Details...");
				System.out.println("accNo is " + account1.getAccNo());
				System.out.println("Name is " + account1.getAccHolderName());
				System.out.println("Amount is " + account1.getBalance());
				break;

			case 3:
				System.out.println("Enter amount to withdraw");
				double amount = sc.nextDouble();
				boolean result = accountoperations.withdraw(account1, amount);
				if (result == true) {
					System.out.println("withdraw is successful");
					System.out.println("new balance " + account1.getBalance());
				} else {
					System.out.println("Withdraw Failed");
				}
				break;

			case 4:
				System.out.println("Enter amount to Deposit:");
				amount = sc.nextDouble();
				result = accountoperations.deposit(account1, amount);
				if (result == true) {
					System.out.println("deposit is successful...");
					System.out.println("new balance " + account1.getBalance());
				} else {
					System.out.println("Deposit Failed");
				}
				break;

			case 5:
				System.out.println("Enter amount to Transfer:");
				amount = sc.nextDouble();
				result = accountoperations.transfer(account1, account2, amount);
				if (result == true) {
					System.out.println("transfer is successful..");
					System.out.println("new balance for account1 " + account1.getBalance());
					System.out.println("new balance for account2 " + account2.getBalance());
				} else {
					System.out.println("Transfer Failed");
				}
				break;

			case 6:
				System.out.println("Enter Account No:");
				int accno = sc.nextInt();
				if (accno == 1) {
					System.out.println("Balance for account1:" + account1.getBalance());
				} else if (accno == 2) {
					System.out.println("Balance for account2:" + account2.getBalance());
				} else {
					System.out.println("Account Not found");
				}
				break;

			case 7:
				System.out.println("Enter Account No for change Balance:");
				accno = sc.nextInt();
				if (accno == 1) {
					System.out.println("Enter new Balance");
					amount = sc.nextDouble();
					account1.setBalance(amount);
					System.out.println("Updating Balance " + account1.getBalance());
				} else if (accno == 2) {
					System.out.println("Enter new Balance");
					amount = sc.nextDouble();
					account2.setBalance(amount);
					System.out.println("Updating Balance " + account2.getBalance());
				} else {
					System.out.println("Account Not found");
				}

				break;

			case 8:
				System.out.println("Thank You For Visiting Us...");
				System.exit(0);

			}

			System.out.println("__________________________________");
			System.out.println("Do You Want to Continue..(Y/N)");
			choice = sc.next();

		} while (choice.equalsIgnoreCase("Y"));

		System.out.println("Thank You For Visiting Us...");

	}

}
