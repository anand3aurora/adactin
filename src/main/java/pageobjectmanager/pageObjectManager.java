package pageobjectmanager;

import org.openqa.selenium.WebDriver;

import baseclass.BaseClass;
import locator.Adactinpage;
import locator.BookHotal;
import locator.Booked_Itenerary;
import locator.Booking_Confirmation;
import locator.LoginPage;
import locator.SelectHotal;

public class pageObjectManager extends BaseClass{


	public pageObjectManager(WebDriver xdriver) {
	
		this.driver = xdriver;
	}
	
	private LoginPage loginp;
	public LoginPage getLoginp() {
		if(loginp== null) {
			loginp = new LoginPage(driver);
		}
		return loginp;
	}

	
	private Adactinpage adactpage;
	public Adactinpage getAdactpage() {
		if(adactpage == null) {
		adactpage =new Adactinpage(driver);
		}
		return adactpage;
	}
	
	private SelectHotal selecthotalp;
	public SelectHotal getSelecthotalp() {
		if(selecthotalp == null) {
			selecthotalp = new SelectHotal(driver);
		}
		return selecthotalp;
	}

	private BookHotal bookhotalp;
	public BookHotal getBookhotalp() {
		if(bookhotalp==null) {
			bookhotalp = new BookHotal(driver);
		}
		return bookhotalp;
	}
	
	private Booking_Confirmation Booking_Confirmationpage;
	public Booking_Confirmation getBooking_Confirmationpage() {
		if(Booking_Confirmationpage == null) {
			Booking_Confirmationpage = new Booking_Confirmation(driver);
		}
		return Booking_Confirmationpage;
	}
	
	private Booked_Itenerary Booked_Itenerarypage;
	public Booked_Itenerary getBooked_Itenerarypage() {
		if (Booked_Itenerarypage == null) {
			Booked_Itenerarypage = new Booked_Itenerary(driver);
		}
		return Booked_Itenerarypage;
	}
	

}