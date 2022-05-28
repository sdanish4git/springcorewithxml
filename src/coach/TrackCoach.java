package coach;

public class TrackCoach implements Coach {
	
	FortuneService fortuneService;
	String testName;
	
	/*public TrackCoach(FortuneService fortuneService,String name){
		this.fortuneService=fortuneService;
		this.testName=name;
	}*/
	
	public String getDailyWorkOut() {
		return "Walk 2km daily in the Evening";
	}
	
	public String getFortune() {
		System.out.println(this.testName);
		return this.fortuneService.getFortune();
	}

	public FortuneService getFortuneService() {
		return fortuneService;
	}

	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	public String getTestName() {
		return testName;
	}

	public void setTestName(String testName) {
		this.testName = testName;
	}
	
	
	
	
	
}
