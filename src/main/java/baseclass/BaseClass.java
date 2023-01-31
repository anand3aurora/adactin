package baseclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	public static WebDriver driver;


	public void browserLaunch() {

		System.setProperty("webdriver.chrome.driver", ".\\src\\test\\resources\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	public void geturl(String url) {

		driver.get(url);
	}
	public void elementclick(WebElement element) {
		
		element.click();
		
	}
	public void isdisplay(WebElement element) {
		
		boolean displayed = element.isDisplayed();
		if(displayed) {
		System.out.println("expected message is displayed");
	}
	}
	public void sendkeys(WebElement element,String String) {
		element.sendKeys(String);
	}
	public void dropdown(WebElement element,int index) throws InterruptedException {
		Select dropdown = new Select(element);
		dropdown.selectByIndex(index);

		
	}
	public void elementclear(WebElement element){
		element.clear();
	}
	public void gettext(WebElement element) {
		System.out.println(element.getText());
		
	}
	public void implicitwait(int longtime) {

			driver.manage().timeouts().implicitlyWait(longtime, TimeUnit.SECONDS);
	}
	




}
