package assignment31;

public class BankB extends Bank
{
private double accountbalance;
	
	public double getBalance(double accountbalance)
	{
		return accountbalance;
	}

	@Override
	public String toString() {
		return "BankB [accountbalance=" + accountbalance + "]";
	}
}
