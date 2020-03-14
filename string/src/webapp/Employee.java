package webapp;

abstract class Market{
	abstract public void makePayment();
	
	public void selectGoods() {
		System.out.println("Goods are to be selected");
		
	}
	public void Dispatch() {
		System.out.println("Goods are dispatched");
	}
}
class childMarket extends Market{
	public void makePayment() {
		System.out.println("Please pay through cash method");
	}
	
}

public class Employee {
	public static void main(String args[]) {
		
		
		childMarket m2=new childMarket();
		m2.makePayment();
		m2.selectGoods();
		m2.Dispatch();
		
	}

}
