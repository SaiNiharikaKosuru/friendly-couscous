package stereotypeAnnotation;

import org.springframework.stereotype.Component;

@Component
public class FortuneService {
	public String getFortune() {
		return "I am Fortune Service class";
	}

}
