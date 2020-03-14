package springexamples;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("beans1.xml");
		HelloWorld obj=(HelloWorld) context.getBean("helloWorld");
		obj.getMessage();
	
		Employee e=(Employee)context.getBean("emp");
		e.showEmployee();
		
		
		context.registerShutdownHook();

	}

}
