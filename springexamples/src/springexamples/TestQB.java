package springexamples;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestQB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("QBXml.xml");
		
		QuestionBank q1=(QuestionBank)context.getBean("qb");
		q1.showAnswers();

	}

}
