package springexamples;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CollectionMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext context=new ClassPathXmlApplicationContext("Collection.xml");
		
CollectionOfValues qs=(CollectionOfValues)context.getBean("exam");
		qs.showData();


	}

}
