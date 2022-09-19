package log4jpackage;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.Test;

public class Log4jDemo {
	
	Logger logger;
	
	@Test(priority=1)
	public void setup() {
		
		logger = Logger.getLogger("Log4jDemo");// Provide test name/class name as parameter
		PropertyConfigurator.configure("log4j.properties");
		
		logger.info("Initial setup started");
		logger.info("Initial setup in progress");
		logger.info("Initial setup completed");
		System.out.println("Perform Initial setup");
	}
	@Test(priority=2)
	public void login() {
		
		logger.info("Perform Login test started");
		logger.info("Perform Login test in progress");
		logger.info("Perform Login test completed");
		System.out.println("Perform Login Test");
	}
	
	@Test(priority=3)
	public void teardown() {
		
		logger.info("Perform Logout completed");
		System.out.println("Perform Logout");
	}
}
