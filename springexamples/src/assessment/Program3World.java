package assessment;

public class Program3World {
	  private String message;

	  public void setMessage(String message){
	     this.message=message;
	  }
	  public void getMessage(){
	     System.out.println("The Message is: "+ message);
	  }
	  public void init(){
	     System.out.println("Bean is Initializing...");
	  }
	  public void destroy(){
	     System.out.println("Bean is going to destroy now");
	  }
	}


