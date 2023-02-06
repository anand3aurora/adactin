package locator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseclass.BaseClass;
import io.cucumber.java.en.Given;

public class SelectHotal extends BaseClass {

	public SelectHotal(WebDriver sdriver) {
		this.driver = sdriver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(name="radiobutton_0")
	private WebElement radiobuttonele;
	@FindBy(name="continue")
	private WebElement searchele;
	@FindBy(xpath = "//td[text()='You have successfully logged out. ']")
	private WebElement logoutdisele;
	@FindBy(id = "arr_date_0")
	private WebElement arrivaldate;
	@FindBy(id = "dep_date_0")
	private WebElement departuredate;
	@FindBy(id="rooms_0")
	private WebElement noofroomsinslecthotal;
	@FindBy(id="room_type_0")
	private WebElement roomtypestand;
	@FindBy(id="no_days_0")
	private WebElement noofdaysinselcthotal;
	@FindBy(id="price_night_0")
	private WebElement pricepernightinselecthotal;
	@FindBy(id="total_price_0")
	private WebElement totalpriceinselecthotal;
	
	
	
	public WebElement getNoofroomsinslecthotal() {
		return noofroomsinslecthotal;
	}
	public WebElement getRadiobuttonele() {
		return radiobuttonele;
	}
	public WebElement getSearchele() {
		return searchele;
	}
	public WebElement getLogoutdisele() {
		return logoutdisele;
	}
	public WebElement getArrivaldate() {
		return arrivaldate;
	}
	public WebElement getDeparturedate() {
		return departuredate;
	}
	public WebElement getRoomtypestand() {
		return roomtypestand;
	}
	public WebElement getNoofdaysinselcthotal() {
		return noofdaysinselcthotal;
	}
	public WebElement getpricepernightinselecthotal() {
		return pricepernightinselecthotal;
	}
	public WebElement getTotalpriceinselecthotal() {
		return totalpriceinselecthotal;
	}
	
	

	
}

