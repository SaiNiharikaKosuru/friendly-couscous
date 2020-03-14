package assessment;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Program5Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx=new ClassPathXmlApplicationContext("exam5xml.xml");

		//get the reference obj for StudentDaoImpl
		Daoimpl sdao=(Daoimpl)ctx.getBean("dao");

		Scanner sc=new Scanner(System.in);
		List<Student>list=sdao.getStudents();
		for(Student ele:list)
		System.out.println(ele.getId()+" "+ele.getName()+" "+ele.getAge());

		}

	}


