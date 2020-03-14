package collections;

import java.util.Collections;
import java.util.LinkedList;

class Student implements Comparable<Student>{
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
	@Override
	public int compareTo(Student student) {
		if(name.compareTo(student.name)<0)
			return -1;
		else if(name.compareTo(student.name)>0)
			return 1;
		else
			return 0;
	}
}
public class ComparableExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student("123","Nikki");
		Student s2=new Student("234","Madhu");
		Student s3=new Student("135","Niks");
		
		LinkedList ar=new LinkedList();
		ar.add(s1);
		ar.add(s2);
		ar.add(s3);
		System.out.println(ar);
		
		Collections.sort(ar);
		ar.forEach(System.out::println);
		Collections.reverse(ar);
		System.out.println("After reverse..");
		ar.forEach(System.out::println);
		
		
		

	}

}
