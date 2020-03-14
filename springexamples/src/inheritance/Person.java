package inheritance;

public class Person {
	String id;
	String name;
	Address address;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public void showData() {
		System.out.println("person with id " + id + " whose name is " + name + " is staying in " + address );
		//System.out.println(address);
	}
	

}
