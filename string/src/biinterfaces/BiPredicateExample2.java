package biinterfaces;
import java.util.*;
import java.util.function.BiFunction;
class Student{
	String htno;
	String name;
	public Student(String htno,String name) {
		this.htno=htno;
		this.name=name;
	}
	@Override
	public String toString() {
		return "htno=" + htno + ",name=" +name;
	}
}



public class BiPredicateExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BiFunction<String,String,Student> bi=(htno,name)->new Student(htno,name);
		
		Student s1=bi.apply("1001","Praveen");
		System.out.println(s1);

	}

}
