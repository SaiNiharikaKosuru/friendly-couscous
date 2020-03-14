package dto;

public class Accounts {
	String acno;
	String name;
	String acktype;
	float balance;
	public Accounts(String acno, String name, String acktype, float balance) {
		super();
		this.acno = acno;
		this.name = name;
		this.acktype = acktype;
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Accounts [acno=" + acno + ", name=" + name + ", acktype=" + acktype + ", balance=" + balance + "]";
	}
	public String getAcno() {
		return acno;
	}
	public void setAcno(String acno) {
		this.acno = acno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAcktype() {
		return acktype;
	}
	public void setAcktype(String acktype) {
		this.acktype = acktype;
	}
	public float getBalance() {
		return balance;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}
	
	

}
