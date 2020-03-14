package stereotypeAnnotation;

import org.springframework.stereotype.Component;

@Component("myCoach")
public class TennisCoachAutoWire {
	private FortuneService fortuneService;
	
	public TennisCoachAutoWire(FortuneService theFortuneService) {
		fortuneService=theFortuneService;
		
	}
	
	public String getDailyWorkout() {
		return "Pratice your backhand volley";
	}
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
