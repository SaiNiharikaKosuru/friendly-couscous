package QB;

class Meal {
	  Meal() {
	    System.out.println("Meal()");
	  }
	}
	class Cheese {
	  Cheese() {
	    System.out.println("Cheese()");
	  }
	}
	class Lunch extends Meal {
	  Lunch() {
	    System.out.println("Lunch()");
	  }
	}
	class PortableLunch extends Lunch {
	  PortableLunch() {
	    System.out.println("PortableLunch()");
	  }
	}
	class Sandwich extends PortableLunch {
	    private Cheese c = new Cheese();

	  public Sandwich() {
	    System.out.println("Sandwich()");
	  }
	}
	public class MyClass7 {
	  public static void main(String[] args) {
	    new Sandwich();
	  }
	} 