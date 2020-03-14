package collections;
import java.util.*;
class Student{
	String htno;
	String name;
	Student(String htno,String name){
		this.name=name;
		this.htno=htno;
	}
	@Override
	public String toString() {
		return "htno=" + htno + ",name=" +name;
	}
}
public class arrayListExample2 {
	public static void main(String[] args) {
		Student s1=new Student("123","Praveen");
		Student s2=new Student("231","Kumar");
		Student s3=new Student("563","Nikki");
		ArrayList ar=new ArrayList();
		ar.add(s1);
		ar.add(s2);
		ar.add(s3);
		System.out.println(ar);
	}

}
