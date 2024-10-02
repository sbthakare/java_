package userinterface;

import java.util.Scanner;

import entity.Account;
import operations.AccountOperations;
import validation.AccountValidation;

public class TestAccount {

	public static void main(String[] args) {

		int ch;
		String choice;
		Scanner sc = new Scanner(System.in);

		Account account1 = new Account();
		Account account2 = new Account();
		AccountValidation accountvalidation =new AccountValidation();

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
				System.out.println("Enter AccountNo,Name,Amount:");
				int accno = sc.nextInt();
				String accHolderName=sc.next();
				double balance=sc.nextDouble();
				
				boolean result=accountvalidation.checkAll(accno, accHolderName,balance);
				if(result==true) {
					System.out.println("All Input Valid");
					account1.setAccNo(accno);
					account1.setAccHolderName(accHolderName);
					account1.setBalance(balance);
				}
				else {
					System.out.println("Invalid Inputs");
				}
				break;

			case 2:
				System.out.println("Displaying Details...");
				System.out.println("accNo is " + account1.getAccNo());
				System.out.println("Name is " + account1.getAccHolderName());
				System.out.println("Amount is " + account1.getBalance());
				break;

			case 3:
				System.out.println(" Enter amount to withdraw");
				 balance = sc.nextDouble();
				 result = accountoperations.withdraw(account1, balance);
				if (result == true) {
					System.out.println("withdraw is successful");
					System.out.println("new balance " + account1.getBalance());
				} else {
					System.out.println("Withdraw Failed");
				}
				break;

			case 4:
				System.out.println(" Enter amount to Deposit:");
				balance = sc.nextDouble();
				result = accountoperations.deposit(account1,balance);
				if (result == true) {
					System.out.println("deposit is successful...");
					System.out.println("new balance " + account1.getBalance());
				} else {
					System.out.println("Deposit Failed");
				}
				break;

			case 5:
				System.out.println(" Enter AccountNo,Name,Amount:");
				 accno = sc.nextInt();
				 accHolderName=sc.next();
				 balance=sc.nextDouble();
				
				 result=accountvalidation.checkAll(accno, accHolderName,balance);
				 
				if(result==true) {
					System.out.println("All Input Valid");
					account2.setAccNo(accno);
					account2.setAccHolderName(accHolderName);
					account2.setBalance(balance);
				}
				else {
					System.out.println("Invalid Inputs");
				}
				
				System.out.println("\n Enter amount to Transfer:");
				balance = sc.nextDouble();
				result = accountoperations.transfer(account1, account2, balance);
				if (result == true) {
					System.out.println("transfer is successful..");
					System.out.println("new balance for account1 " + account1.getBalance());
					System.out.println("new balance for account2 " + account2.getBalance());
				} else {
					System.out.println("Transfer Failed");
				}
				break;

			case 6:
				System.out.println(" Enter Account No:");
				 accno = sc.nextInt();
				if (accno == account1.getAccNo()) {
					System.out.println("Balance for account1:" + account1.getBalance());
				} else if (accno == account2.getAccNo()) {
					System.out.println("Balance for account2:" + account2.getBalance());
				} else {
					System.out.println("Account Not found");
				}
				break;

			case 7:
				System.out.println(" Enter Account No for change Balance:");
				accno = sc.nextInt();
				if (accno == account1.getAccNo()) {
					System.out.println(" Enter new Balance");
					balance = sc.nextDouble();
					account1.setBalance(balance);
					System.out.println("Updating Balance " + account1.getBalance());
				} else if (accno ==account2.getAccNo()) {
					System.out.println(" Enter new Balance");
					balance = sc.nextDouble();
					account2.setBalance(balance);
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
