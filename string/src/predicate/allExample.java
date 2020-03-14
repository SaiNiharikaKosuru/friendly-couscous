package predicate;

import java.util.ArrayList;
import java.util.function.Predicate;
import java.util.function.Function;
import java.util.function.Consumer;

class Student{
	String name;
	int marks;
	public Student(String name,int marks) {
		this.name=name;
		this.marks=marks;
	}
}
public class allExample {
	
	public static void main(String[] args) {
		ArrayList<Student> list=new ArrayList<Student>();
		Student s1=new Student("Niharika",85);
		Student s2=new Student("Praveen",60);
		Student s3=new Student("Anu",50);
		Student s4=new Student("Pranu",79);
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		
		Predicate<Student> p=s->s.marks>=60;
		System.out.println(p.test(s1));
		
		Function<Student,String> fu=s->{
		
		int marks=s.marks;
		if(marks>=80) {
			return "A[Distinction]";
		}
		else if(marks<=60) {
			return "B[First class]";
		}
		else if(marks>=50) {
			return "C[Second class]";
		}
		else if(marks>=35) {
			return "D[Third class]";
		}else {
			return "Fail";
		}
		
		};
		
		Consumer<Student> c=s->{
			System.out.println("Student name:"+s.name);
			System.out.println("Student marks:"+s.marks);
			System.out.println("Student grade:"+fu.apply(s));
			System.out.println();
			
		};
		for(Student s:list) {
			if(p.test(s)) 
				c.accept(s);
			
			
		}
	}

}
