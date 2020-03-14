package springexamples;

public class Employee {
	String name;
	String dept;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public void showEmployee() {
		System.out.println("Name is:"+name+"Department is:"+dept);
	}
	public void startMethod() {
		System.out.println("The initialization is started...");
	}
	public void stopMethod() {
		System.out.println("The initialization is stopped...");
	}

}
