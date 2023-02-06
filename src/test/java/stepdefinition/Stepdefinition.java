package stepdefinition;

import java.sql.Driver;
import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import baseclass.BaseClass;
import io.cucumber.java.en.Given;
import locator.LoginPage;
import pageobjectmanager.pageObjectManager;


public class Stepdefinition extends BaseClass{
	
pageObjectManager obj = new pageObjectManager(driver);

@Given("Launch hotel reservation application using URL as in test data.{string}")
public void launch_hotel_reservation_application_using_url_as_in_test_data(String string) {
	browserLaunch();
	geturl(string);
}

@Given("Login to the application using username {string} and password {string} as in test data.")
public void login_to_the_application_using_username_and_password_as_in_test_data(String string, String string2) {
	implicitwait(10);
	sendkeys(obj.getLoginp().getUsernameele(), string);
	sendkeys(obj.getLoginp().getPasswordele(), string2);
	elementclick(obj.getLoginp().getLoginele());
}

@Given("Launch hotel test data.{string}")
public void launch_hotel_test_data(String url) {
	browserLaunch();
	geturl(url);
}
@Given("Login username {string} password {string} as test data.")
public void login_username_password_as_test_data(String string, String string2) {
	implicitwait(10);
	sendkeys(obj.getLoginp().getUsernameele(), string);
	sendkeys(obj.getLoginp().getPasswordele(), string2);
	elementclick(obj.getLoginp().getLoginele());
}


//=============================@TC-102==================================================


@Given("Select location as in test data.")
public void select_location_as_in_test_data() throws InterruptedException {
	elementclick(obj.getAdactpage().getLocationele());
	dropdown(obj.getAdactpage().getLocationele(), 1);
}
@Given("Select hotel as in test data.")
public void select_hotel_as_in_test_data() throws InterruptedException {
	elementclick(obj.getAdactpage().getHotelsele());
	dropdown(obj.getAdactpage().getHotelsele(), 1);
}
@Given("Select room type as in test data.")
public void select_room_type_as_in_test_data() throws InterruptedException {
	elementclick(obj.getAdactpage().getRoomtypeele());
	dropdown(obj.getAdactpage().getRoomtypeele(), 1);
}
@Given("Select no-ofrooms as in test data.")
public void select_no_ofrooms_as_in_test_data() throws InterruptedException {
	elementclick(obj.getAdactpage().getNoofroomsele());
	dropdown(obj.getAdactpage().getNoofroomsele(), 1);
}
@Given("Enter check-indate later than the check-outdate field as in test data.")
public void enter_check_indate_later_than_the_check_outdate_field_as_in_test_data() throws InterruptedException {
	elementclear(obj.getAdactpage().getDatepickinele());
	sendkeys(obj.getAdactpage().getDatepickinele(), "28/08/2023");
	elementclear(obj.getAdactpage().getDatepickoutele());
	sendkeys(obj.getAdactpage().getDatepickoutele(), "27/08/2023");
	elementclick(obj.getAdactpage().getSearch());
	isdisplay(obj.getAdactpage().getCheckouterrdisplay());	
	Thread.sleep(3000);
}



}

	


