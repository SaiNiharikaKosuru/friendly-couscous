package eventHandlers;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainOfEvent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConfigurableApplicationContext context=new ClassPathXmlApplicationContext("EventHandlersxml.xml");
		
		context.start();
		
		HelloWorld obj=(HelloWorld)context.getBean("helloWorld");
		obj.displayMessage();
		
		context.refresh();
		
		context.stop();

	}

}
