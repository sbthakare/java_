package operations;

import entity.Account;

public class AccountOperations {

	// Accountclass
	public boolean withdraw(Account account, double amount) {
		double bal = account.getBalance(); // get the balance from account class

		if (bal < amount) { // check balance<amount if true return false
			System.out.println("Not Enough Balance!!");
			return false;
		} else if (amount < 0) { // if bal<0 if true return false
			System.out.println("withdraw amount can not be -ve.");
			return false;
		} else {
			bal = bal - amount;
			account.setBalance(bal); // set bal in Account class
			return true;
		}
	}

	public boolean deposit(Account account, double amount) {
		double bal = account.getBalance();

		if (amount < 0) {
			System.out.println("Deposit Balance should greater than 0 ");
			return false;
		} else if (amount > 100000) {
			System.out.println("Show the proof!");
			return false;
		} else {
			bal = bal + amount;
			account.setBalance(bal);

			return true;
		}
	}

	public boolean transfer(Account account1, Account account2, double amount) {
		double bal1 = account1.getBalance();
		double bal2 = account2.getBalance();

		if (amount < 0) {
			System.out.println("Transfer should greater than 0 ");
			return false;
		} else if (bal1 < amount) {
			System.out.println("not enought balance");
			return false;
		} else {
			bal1 = bal1 - amount;
			bal2 = bal2 + amount;

			account1.setBalance(bal1);
			account2.setBalance(bal2);
			return true;
		}

	}
}
