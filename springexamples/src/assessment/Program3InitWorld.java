package assessment;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class Program3InitWorld  {
	 public Object postProcessBeforeInitialization(Object bean, String beanName) 
		     throws BeansException {
        
        System.out.println("Before Initialization : " + beanName);
        return bean; 
     }
     public Object postProcessAfterInitialization(Object bean, String beanName) 
        throws BeansException {
        
        System.out.println("After Initialization : " + beanName);
        return bean; 
     }

}
