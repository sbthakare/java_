package abstractpackage;

abstract class BankAccount {

	protected int id;
	protected float balance;

	public abstract float CalculateInterest();

	public BankAccount(int id, float balance) {
		super();
		this.id = id;
		this.balance = balance;
	}

}

class CurrentAccount extends BankAccount {

	public CurrentAccount(int id, float balance) {
		super(id, balance);

	}

	public float CalculateInterest() {
		return (balance * 0.07f);

	}
}

class LoanAccount extends BankAccount {

		public LoanAccount(int id, float balance) {
			super(id, balance);
		}

		public float CalculateInterest() {
			return (balance * 0.1f);
		}

	}


class SavingAccount extends BankAccount {

	public SavingAccount(int id, float balance) {
		super(id, balance);

	}

	public float CalculateInterest() {
		return (balance * 0.056f);
	}
}

public class TestBankAccount {

	public static void main(String[] args) {

		CurrentAccount currentaccount = new CurrentAccount(1, 25000);
		System.out.println("CurrentAccount Interest:"+currentaccount.CalculateInterest());

		LoanAccount loanaccount = new LoanAccount(1, 40000);
		System.out.println("LoanAccount Interest:"+loanaccount.CalculateInterest());

		SavingAccount savingaccount = new SavingAccount(1, 30000);
		System.out.println("SavingAccount Interest:"+savingaccount.CalculateInterest());

	}

}

