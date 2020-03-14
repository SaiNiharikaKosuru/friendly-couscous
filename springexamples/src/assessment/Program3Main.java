package assessment;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Program3Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 AbstractApplicationContext context = new ClassPathXmlApplicationContext("Program3xml.xml");

	     Program3World a = (Program3World) context.getBean("helloWorld");
	     a.getMessage();
	     context.registerShutdownHook();
	  }

	}


