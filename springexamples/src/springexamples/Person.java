package springexamples;

public class Person {
	String name;
	String Gender;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public void showPerson() {
		System.out.println("The person's name is:" + name +"and the gender is:" + Gender );
		
	}

}
