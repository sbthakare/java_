package module6;

public class Customer {

	private int custid;
	private String name;
	private int mobile;
	private String address;

	public Customer() {
		custid = 0;
		name = null;
		mobile = 0;
		address = null;
	}

	public Customer(int custid, String name, int mobile, String address) {
		super();
		this.custid = custid;
		this.name = name;
		this.mobile = mobile;
		this.address = address;
	}

	public int getCustid() {
		return custid;
	}

	public void setCustid(int custid) {
		this.custid = custid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMobile() {
		return mobile;
	}

	public void setMobile(int mobile) {
		this.mobile = mobile;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public String toString()
	{
		return " Custid is "+custid+"\n Name is "+name+"\n Mobile no is "+mobile+"\n Address is "+address;
	}

}
