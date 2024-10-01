package assignment31;

public class TestBank {

	public static void main(String[] args) {
		
		BankA banka=new BankA();
		double balance=banka.getBalance(1000);
		double interest=banka.applyInterest(balance);
		System.out.println("BankA:"+interest);
		
		
		BankB bankb=new BankB();
		 balance=banka.getBalance(1500);
		 interest=bankb.applyInterest(balance);
		System.out.println("BankB"+interest);
		
		
		BankC bankc=new BankC();
		 balance=bankc.getBalance(2000);
		 interest=bankb.applyInterest(balance);
			System.out.println("BankC:"+interest);
	}

}
