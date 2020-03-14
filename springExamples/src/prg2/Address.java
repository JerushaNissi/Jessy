package prg2;

public class Address {
	
	String dno;
	String street;
	String city;
	Address(String dno, String street, String city) {
		super();
		this.dno = dno;
		this.street = street;
		this.city = city;
	}
	@Override
	public String toString() {
		return "Address [dno=" + dno + ", street=" + street + ", city=" + city + "]";
	}

}
