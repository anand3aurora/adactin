package hooks;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import baseclass.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;

public class Hooks extends BaseClass{
	
	
	@After
	public static void aft(Scenario scenario) throws InterruptedException {
		Thread.sleep(1000);
		TakesScreenshot ts = (TakesScreenshot)driver;
		byte[] screenshotAs = ts.getScreenshotAs(OutputType.BYTES);
		scenario.attach(screenshotAs, "image/png", "screenshot");
			
			
	
		
		
		
	}
}
