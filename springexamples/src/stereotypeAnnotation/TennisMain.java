package stereotypeAnnotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TennisMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("stereotypexml.xml");
		
		//get the bean from the spring container
		TennisCoach theCoach=context.getBean(TennisCoach.class);
		FootBall fCoach=context.getBean(FootBall.class);
		
		//call a method on the bean
		theCoach.show();
		fCoach.foot();
		
		//close the context
		context.close();
		
		
		

	}

}
