package springexamples;

public class HelloWorld {
	private String s;

	public void getMessage() {
		System.out.println("Your Message is"  +  s);
	}
	public void setS(String s) {
		this.s = s;
	}
	public void init() {
		System.out.println("Init is started...");
	}
}
