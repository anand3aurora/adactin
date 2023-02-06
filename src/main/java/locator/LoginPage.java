package locator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseclass.BaseClass;

public class LoginPage extends BaseClass{
public LoginPage(WebDriver xdriver) {

	this.driver = xdriver;
	
	PageFactory.initElements(driver, this);

}

	@FindBy(xpath="//img[@alt=\"AdactIn Group\"]")
	private WebElement adactinlogo;

	@FindBy(id="username")
	private WebElement usernameele;

	@FindBy(id="password")
	private WebElement passwordele;
	
	@FindBy(id="login")
	private WebElement loginele;
	
	
	
	
	public WebElement getAdactinlogo() {
		return adactinlogo;
	}			
	public WebElement getUsernameele() {
		return usernameele;
	}
	public WebElement getPasswordele() {
		return passwordele;
	}
	public WebElement getLoginele() {
		return loginele;
	}




	
	
}
