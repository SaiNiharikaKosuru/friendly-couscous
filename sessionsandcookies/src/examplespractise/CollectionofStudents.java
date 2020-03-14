package examplespractise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class CollectionofStudents {

	public static void main(String[] args) {
		ArrayList<Student>list=new ArrayList<Student>();
		Student s1=new Student("Niha",22,"Hyderabad");
		Student s2=new Student("Anu",26,"Vijayawada");
		Student s3=new Student("Shahin",24,"Kolkata");
		Student s4=new Student("Pranu",16,"Vijayawada");
		Student s5=new Student("Bana",18,"Bangalore");
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
		Collections.sort(list);
		list.forEach(System.out::println);
		
		
	}

}

