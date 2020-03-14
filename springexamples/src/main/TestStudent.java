package main;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dao.StudentDaoImpl;
import data.Student;

public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContextOfStudent.xml");
		StudentDaoImpl sdao=(StudentDaoImpl)context.getBean("edao");
		System.out.println("Enter student id:");
		int id=sc.nextInt();
		System.out.println("Enter student name");
		String name=sc.next();
		System.out.println("Enter student age");
		int age=sc.nextInt();
		
		Student student=new Student();
		student.setId(id);
		student.setName(name);
		student.setAge(age);
		sdao.create(student);

	}

}
