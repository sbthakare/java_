package assignment31;

public class BankC extends Bank
{
private double accountbalance;
	
	public double getBalance(double accountbalance)
	{
		return accountbalance;
	}

	@Override
	public String toString() {
		return "BankC [accountbalance=" + accountbalance + "]";
	}
}
