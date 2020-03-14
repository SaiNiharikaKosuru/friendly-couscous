package webapp;

interface RBI{
	abstract public void savings();
	abstract public void loans();
	abstract public void deposit();
	static void socialServices() {
		System.out.println("The services include:");
	}
}
class HDFC implements RBI{
	static void socialServices() {
		System.out.println("HDFC socials services :");
	}
	public void savings() {
		System.out.println("HDFC savings account");
	}
	public void loans() {
		System.out.println("HDFC loan rules are:education only");
	}
	public void deposit() {
		System.out.println("HDFC deposit is 3000");
	}
}
class SBI implements RBI{
	public void savings() {
		System.out.println("SBI savings account");
	}
	public void loans() {
		System.out.println("SBI loan rules are:only for gold");
	}
	public void deposit() {
		System.out.println("SBI deposit is 3000");
	}
}
public class interfaceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HDFC hdfc = new HDFC();
		hdfc.savings();
		hdfc.loans();
		hdfc.deposit();
		hdfc.socialServices();
		System.out.println("Other bank rules are:");
		SBI sbi = new SBI();
		sbi.savings();
		sbi.loans();
		sbi.deposit();
		
		

	}

}
