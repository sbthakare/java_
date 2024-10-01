package assignment31;

public class Bank {
  protected double accountbalance;
  protected static double INTEREST=0.10;
  
  public double getBalance(double accountbalance)
  {
	  return accountbalance;
  }
  
  public double applyInterest(double accountbalance)
  { 
	  accountbalance=accountbalance*INTEREST;
	  return accountbalance;
  }

@Override
public String toString() {
	return "Bank [accountbalance=" + accountbalance + ", INTEREST=" + INTEREST + "]";
}
  
  
}
