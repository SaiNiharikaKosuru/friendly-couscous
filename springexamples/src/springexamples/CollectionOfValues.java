package springexamples;

public class CollectionOfValues {
	int id;
	String name;
	String answers;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAnswers() {
		return answers;
	}
	public void setAnswers(String answers) {
		this.answers = answers;
	}
	public void showData() {
		System.out.println("id is:"+ id + "name is:"+ name + "answers are:"+answers);
	}

}
