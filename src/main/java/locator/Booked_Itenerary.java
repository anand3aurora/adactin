package locator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseclass.BaseClass;

public class Booked_Itenerary extends BaseClass{

	public Booked_Itenerary(WebDriver Bookeddriver) {
	this.driver = 	Bookeddriver;
	PageFactory.initElements(driver, this);
	
	}
	@FindBy(id="hotel_name_827030")
	private WebElement bookeditehotal;
	@FindBy(xpath = "(//input[@class='select_text'])[5]")
	
	//tr//input[@class="select_text"]
	private WebElement nameinbookeditenarele;
	@FindBy(id="last_name_827030")
	private WebElement lastnameinbookediternarele;
	@FindBy(id="order_id_text")
	private WebElement orderidenterfield;
	@FindBy(id="search_hotel_id")
	private WebElement gobutton;
	@FindBy(id="order_id_827064")
	private WebElement searchbygo;
	@FindBy(xpath = "//input[@value='Hotel Creek']")
	private WebElement bookitenarhotalnameele;
	@FindBy(xpath = "//input[@value='Sydney']")
	private WebElement bookitenarlocationele;
	@FindBy(xpath = "//input[@value='2 Rooms']")
	private WebElement bookitenarrooms;
	@FindBy(xpath = "//input[@value='27/07/2023']")
	private WebElement bookitenararrivalele;
	@FindBy(xpath = "//input[@value='28/07/2023']")
	private WebElement bookitenardepartureele;
	@FindBy(xpath = "//input[@name=\"ids[]\"]")
	private WebElement clickradiobuttonele;
	@FindBy(xpath = "//input[@value=\"Cancel Selected\"]")
	private WebElement clickcancelbuttonele;
	@FindBy(id = "search_result_error")
	private WebElement searchresulterrorele;
	@FindBy(xpath = "//td[text()=\"Booked Itinerary\"]")
	private WebElement bookitinerarylogoele;
	
	public WebElement getBookeditehotal() {
		return bookeditehotal;
	}
	public WebElement getNameinbookeditenarele() {
		return nameinbookeditenarele;
	}
	public WebElement getLastnameinbookediternarele() {
		return lastnameinbookediternarele;
	}
	public WebElement getOrderidenterfield() {
		return orderidenterfield;
	}
	public WebElement getGobutton() {
		return gobutton;
	}
	public WebElement getSearchbygo() {
		return searchbygo;
	}
	public WebElement getBookitenarhotalnameele() {
		return bookitenarhotalnameele;
	}
	public WebElement getBookitenarlocationele() {
		return bookitenarlocationele;
	}
	public WebElement getBookitenarrooms() {
		return bookitenarrooms;
	}
	public WebElement getBookitenararrivalele() {
		return bookitenararrivalele;
	}
	public WebElement getBookitenardepartureele() {
		return bookitenardepartureele;
	}
	public WebElement getClickradiobuttonele() {
		return clickradiobuttonele;
	}
	public WebElement getClickcancelbuttonele() {
		return clickcancelbuttonele;
	}
	public WebElement getSearchresulterrorele() {
		return searchresulterrorele;
	}
	public WebElement getBookitinerarylogoele() {
		return bookitinerarylogoele;
	}
	
	
}
