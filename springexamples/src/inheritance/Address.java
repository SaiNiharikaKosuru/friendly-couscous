package inheritance;

public class Address {
	String dno;
	@Override
	public String toString() {
		return "Address [dno=" + dno + ", street=" + street + ", city=" + city + "]";
	}
	String street;
	String city;
	 public String getDno() {
		return dno;
	}
	public void setDno(String dno) {
		this.dno = dno;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}

}
