package locator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseclass.BaseClass;

public class Booking_Confirmation extends BaseClass {

	public Booking_Confirmation(WebDriver boodriver) {
		this.driver = boodriver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "order_no")
	private WebElement orderno;
	@FindBy(id="my_itinerary")
	private WebElement myitinebutton;
	@FindBy(id="hotel_name")
	private WebElement bookconfirmhotalele;
	@FindBy(id="location")
	private WebElement bookconfirmlocationele;
	@FindBy(id="total_rooms")
	private WebElement bookconfirmtotalroomele;
	@FindBy(id="arrival_date")
	private WebElement bookconfirmarrivaldateele;
	@FindBy(id="departure_text")
	private WebElement bookconfirmdapartureele;
	
	
	public WebElement getMyitinebutton() {
		return myitinebutton;
	}
	public WebElement getOrderno() {
		return orderno;
	}
	public WebElement getBookconfirmhotalele() {
		return bookconfirmhotalele;
	}
	public WebElement getBookconfirmlocationele() {
		return bookconfirmlocationele;
	}
	public WebElement getBookconfirmtotalroomele() {
		return bookconfirmtotalroomele;
	}
	public WebElement getBookconfirmarrivaldateele() {
		return bookconfirmarrivaldateele;
	}
	public WebElement getBookconfirmdapartureele() {
		return bookconfirmdapartureele;
	}
	
}
