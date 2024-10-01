package assignment31;

public class BankA extends Bank {
	private double accountbalance;
	
	public double getBalance(double accountbalance)
	{
		return accountbalance;
	}

	@Override
	public String toString() {
		return "BankA [accountbalance=" + accountbalance + "]";
	}
	
	
}
