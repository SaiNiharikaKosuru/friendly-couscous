package springexamples;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class InitBeans implements BeanPostProcessor{
	public Object postProcessorBeforeInitialization(Object bean,String beanName) 
	throws BeansException{
		System.out.println("Before Initialization");
		return bean;
	}
	public Object postProcessorAfterInitialization(Object bean,String beanName) 
			throws BeansException{
				System.out.println("Before Initialization");
				return bean;
			}

}
