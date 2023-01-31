package locator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseclass.BaseClass;

public class Adactinpage extends BaseClass{
	public Adactinpage(WebDriver xdriver) {
this.driver = xdriver;
	PageFactory.initElements(driver, this);
	}

	
@FindBy(id="location")
private WebElement locationele;
@FindBy(id="hotels")
private WebElement hotelsele;
@FindBy(id="room_type")
private WebElement roomtypeele;
@FindBy(id="room_nos")
private WebElement noofroomsele;
@FindBy(id="datepick_in")
private WebElement datepickinele;
@FindBy(id="datepick_out")
private WebElement datepickoutele;
@FindBy(id="Submit")
private WebElement search;
@FindBy (id="checkout_span")
private WebElement checkouterrdisplay;
@FindBy(id="adult_room")
private WebElement adultroomele;
@FindBy(id="child_room")
private WebElement childroomele;
@FindBy(xpath="//select//option[text()='Hotel Creek']")
private WebElement hotelcreekele;
@FindBy(xpath = "//input[@name='hotel_name_0']")
private WebElement hotalnameele;
@FindBy(id="datepick_in")
private WebElement checkindate;
@FindBy(id="datepick_out")
private WebElement checkoutdate;
@FindBy(xpath = "//select[@id=\"room_nos\"]//option[text()='3 - Three']")
private WebElement noofroom;
@FindBy(xpath = "//select[@id=\"room_type\"]//option[text()='Standard']")
private WebElement roomtypstand;
@FindBy(xpath = "//a[@href='SearchHotel.php']")
private WebElement searchhotallinkele;
@FindBy(xpath = "//td[text()='Search Hotel ']")
private WebElement searchhotaldisele;
@FindBy(xpath = "//a[@href=\"BookedItinerary.php\"]")
private WebElement bookitineraryele;
@FindBy(xpath = "//td[text()=\"Welcome to Adactin Group of Hotels\"]")
private WebElement welcomemessage;





public WebElement getNoofroom() {
	return noofroom;
}

public WebElement getLocationele() {
	return locationele;
}
public WebElement getHotelsele() {
	return hotelsele;
}
public WebElement getRoomtypeele() {
	return roomtypeele;
}
public WebElement getNoofroomsele() {
	return noofroomsele;
}
public WebElement getDatepickinele() {
	return datepickinele;
}
public WebElement getDatepickoutele() {
	return datepickoutele;
}
public WebElement getSearch() {
	return search;
}
public WebElement getCheckouterrdisplay() {
	return checkouterrdisplay;
}
public WebElement getAdultroomele() {
	return adultroomele;
}
public WebElement getChildroomele() {
	return childroomele;
}
public WebElement getHotelcreekele() {
	return hotelcreekele;
}

public WebElement getHotalnameele() {
	return hotalnameele;
}
public WebElement getCheckindate() {
	return checkindate;
}

//==================================================



public WebElement getWelcomemessage() {
	return welcomemessage;
}

public WebElement getBookitineraryele() {
	return bookitineraryele;
}

public WebElement getSearchhotaldisele() {
	return searchhotaldisele;
}

public WebElement getSearchhotallinkele() {
	return searchhotallinkele;
}

public WebElement getRoomtypstand() {
	return roomtypstand;
}

public WebElement getCheckoutdate() {
	return checkoutdate;
}









}
