package validation;

public class AccountValidation {
	
	
	public boolean checkAccno(int accNo) {
		if (accNo <= 0) {
			System.out.println("Invalid Account Number.");
			return false;
		} else {
			return true;
		}
	}

	public boolean checkBalance(double balance) {
		if (balance <= 0) {
			System.out.println("Invalid Balance");
			return false;
		} else if (balance > 100000) {
			System.out.println("Show the Proof");
			return false;
		} else {
			return true;
		}
	}

	public boolean checkAccHolderName(String accHolderName) {
		boolean valid = false;
		char ch;

		for (int i = 0; i < accHolderName.length(); i++) {
			ch = accHolderName.charAt(i); // return the ch

			if ((ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122)) // checking Ascii Value Of char
			{
				valid = true;
			} else {
				valid = false;
			}
		}

		if (valid == true) {
			System.out.println("Valid Name.");
			return true;
		}
		else {
			System.out.println("InValid Name.");
			return false;
		}
	}
	
	public boolean checkAll(int accNo,String accHolderName,double balance)
	{
		if(!checkAccno( accNo))
		 return false;
		else if(!checkAccHolderName(accHolderName))
			 return false;
		else if(!checkBalance( balance))
			 return false;
		else 
			return true;
	}
}
