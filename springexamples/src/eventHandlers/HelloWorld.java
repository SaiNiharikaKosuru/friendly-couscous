package eventHandlers;

public class HelloWorld {
	String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void displayMessage() {
		System.out.println("The message is:"+ message);
	}

}
