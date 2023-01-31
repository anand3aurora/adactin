package locator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseclass.BaseClass;

public class BookHotal extends BaseClass {

	public BookHotal(WebDriver Bdriver) {
		this.driver = Bdriver;
PageFactory.initElements(driver, this);
	}

	@FindBy(id = "first_name")
	private WebElement nameele;

	@FindBy(id = "last_name")
	private WebElement lastnameele;

	@FindBy(id = "address")
	private WebElement addressele;

	@FindBy(id = "cc_num")
	private WebElement creditcardnumele;

	@FindBy(id = "cc_type")
	private WebElement creditcarttypeele;

	@FindBy(id = "cc_exp_month")
	private WebElement expirymonthele;

	@FindBy(id = "cc_exp_year")
	private WebElement expiryyearele;

	@FindBy(id = "cc_cvv")
	private WebElement cvvnumele;

	@FindBy(id = "book_now")
	private WebElement booknowbutton;
	
	@FindBy(id = "logout")
	private WebElement logoutele;

	@FindBy(id = "room_num_dis")
	private WebElement numofrooms;
	
	@FindBy(id = "total_days_dis")
	private WebElement numofdays;
	
	@FindBy(id = "price_night_dis")
	private WebElement pricepernight;
	
	@FindBy(id = "total_price_dis")
	private WebElement totalprice;
	
	@FindBy(id="final_price_dis")
	private WebElement finalbillprice;
	
	
	
	public WebElement getPricepernight() {
		return pricepernight;
	}

	public WebElement getTotalprice() {
		return totalprice;
	}

	public WebElement getLastnameele() {
		return lastnameele;
	}

	public WebElement getAddressele() {
		return addressele;
	}

	public WebElement getCreditcardnumele() {
		return creditcardnumele;
	}

	public WebElement getCreditcarttypeele() {
		return creditcarttypeele;
	}

	public WebElement getExpirymonthele() {
		return expirymonthele;
	}

	public WebElement getExpiryyearele() {
		return expiryyearele;
	}

	public WebElement getCvvnumele() {
		return cvvnumele;
	}

	public WebElement getBooknowbutton() {
		return booknowbutton;
	}

	public WebElement getNameele() {
		return nameele;
	}

	public WebElement getLogoutele() {
		return logoutele;
	}

	public WebElement getNumofrooms() {
		return numofrooms;
	}

	public WebElement getNumofdays() {
		return numofdays;
	}

	public WebElement getFinalbillprice() {
		return finalbillprice;
	}
	

}
