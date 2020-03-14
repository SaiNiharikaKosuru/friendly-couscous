package springexamples;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestOfPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
		
		Person p=(Person)context.getBean("person");
		p.showPerson();


	}

}
