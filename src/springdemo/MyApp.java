package springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import coach.BaseBallCoach;
import coach.Coach;
import coach.FortuneService;
import coach.GreetingFortuneService;
import coach.HappyFortuneService;
import coach.TrackCoach;

public class MyApp {
	
	public static void main(String[] args) {
		
		/*FortuneService fortuneService=new HappyFortuneService();
		fortuneService=new GreetingFortuneService();
		Coach coach=new TrackCoach(fortuneService);
		System.out.println(coach.getDailyWorkOut());
		System.out.println(coach.getFortune());*/
		
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach coach=context.getBean("myCoach",Coach.class);
		
		System.out.println(coach.getDailyWorkOut());
		System.out.println(coach.getFortune());
		Coach coach1=context.getBean("myCoach",Coach.class);
		
		
	}
}
