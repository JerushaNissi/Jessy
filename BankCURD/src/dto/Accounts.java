package dto;

public class Accounts {
	String acntnum;
	String name;
	String acnttype;
	Float balance;
	
	public Accounts(String acntnum, String name, String acnttype, Float balance) {
		super();
		this.acntnum = acntnum;
		this.name = name;
		this.acnttype = acnttype;
		this.balance = balance;
	}

	public String getAcntnum() {
		return acntnum;
	}

	public void setAcntnum(String acntnum) {
		this.acntnum = acntnum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAcnttype() {
		return acnttype;
	}

	public void setAcnttype(String acnttype) {
		this.acnttype = acnttype;
	}

	public Float getBalance() {
		return balance;
	}

	public void setBalance(Float balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Accounts [acntnum=" + acntnum + ", name=" + name + ", acnttype=" + acnttype + ", balance=" + balance
				+ "]";
	}

	public String getAccountNumber() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getAccountType() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getCustomername() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
