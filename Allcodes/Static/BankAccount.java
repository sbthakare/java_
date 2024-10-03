package Static;

public class BankAccount {

	private int accNo;
	private double balance;
	private static int idNum=1;
	
	
	public BankAccount() {
		accNo=idNum++;
		balance=0;
	}
	
	
	public BankAccount( double balance) {
		super();
		this.accNo = idNum++;
		this.balance = balance;
		//System.out.println(accNo);
	}

//	 public static int getIdNum()
//	 {
//		 return idNum;
//	 }


	@Override
	public String toString() {
		return "BankAccount [accNo=" + accNo + ", balance=" + balance + "]";
	}


	public static void main(String[] args) {
		
		BankAccount bankaccount=new BankAccount(500);
//		System.out.println(bankaccount.getIdNum());
		System.out.println(bankaccount);
		
		BankAccount bankaccount1=new BankAccount(1000);
//		System.out.println(bankaccount1.getIdNum());
		System.out.println(bankaccount1);
		
		
		BankAccount bankaccount2=new BankAccount();
//		System.out.println(bankaccount2.getIdNum());
		System.out.println(bankaccount2);
		

	}

}
