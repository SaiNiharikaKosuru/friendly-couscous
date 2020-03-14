package javaAssessment;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class Student{
	String name;
	int marks;
	public Student(String name,int marks) {
		this.name=name;
		this.marks=marks;
	}
}

public class StudentsArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> list=new ArrayList<Student>();
		Student s1=new Student("Niharika",85);
		Student s2=new Student("Anu",60);
		Student s3=new Student("Shahin",31);
		Student s4=new Student("Pranu",30);
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		
		Predicate<Student> p=s->s.marks>=35;
		System.out.println(p.test(s1));
		
		Function<Student,String> fu=s->{
		
		int marks=s.marks;
		if(marks>=80) {
			return "A[Distinction]";
		}
		else if(marks>=60||marks<=79) {
			return "B[First class]";
		}
		else if(marks>=35||marks<=50) {
			return "C[Second class]";
		}
		else {
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


	
