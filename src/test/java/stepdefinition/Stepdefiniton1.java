package stepdefinition;

import static org.junit.Assert.fail;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Assert;
import org.openqa.selenium.Alert;

import baseclass.BaseClass;
import io.cucumber.java.en.Given;
import pageobjectmanager.pageObjectManager;

public class Stepdefiniton1 extends BaseClass {
	public static String expected;
	public static String attribute;
	public static String attribute2;
	public static String noofrooms;
	public static String noofroomsinhotalselect;
	public static String roomtypestandard;
	public static String selecthotalroomtypestand;
	public static String nameg;
	public static String lastnameg;
	public static String ordernum;
	pageObjectManager obj = new pageObjectManager(driver);
	Stepdefinition sd = new Stepdefinition();
	

//	=============================@TC-104==================================================

	@Given("Select location as in test")
	public void select_location_as_in_test() throws InterruptedException {
		implicitwait(10);
		elementclick(obj.getAdactpage().getLocationele());
		dropdown(obj.getAdactpage().getLocationele(), 1);
	}

	@Given("Select hotel as in test")
	public void select_hotel_as_in_test() throws InterruptedException, IOException, InvalidFormatException {
		elementclick(obj.getAdactpage().getHotelsele());
		dropdown(obj.getAdactpage().getHotelsele(), 1);

		expected = obj.getAdactpage().getHotelcreekele().getText();
		System.out.println("Selected hotal in search hotal page is " + expected);
		String path = "C:\\Users\\Asus\\Desktop\\adactin.xlsx";
		File f = new File(path);
		FileInputStream fs = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fs);
//		Sheet sh = wb.getSheetAt(0);
//		Row createRow = sh.createRow(0);
//		Cell createCell = createRow.createCell(0);
//		createCell.setCellValue(expected);

		wb.getSheetAt(0).createRow(0).createCell(0).setCellValue(expected);

		FileOutputStream out = new FileOutputStream(f);
		wb.write(out);
		out.close();
	}

	@Given("Select room type as in test")
	public void select_room_type_as_in_test() throws InterruptedException {
		elementclick(obj.getAdactpage().getRoomtypeele());
		dropdown(obj.getAdactpage().getRoomtypeele(), 1);

	}

	@Given("Select noof-rooms as in test")
	public void select_noof_rooms_as_in_test() throws InterruptedException {
		elementclick(obj.getAdactpage().getRoomtypeele());
		dropdown(obj.getAdactpage().getRoomtypeele(), 1);
	}

	@Given("Enter checkout-date as in test")
	public void enter_checkout_date_as_in_test() throws InterruptedException {
		elementclear(obj.getAdactpage().getDatepickinele());
		sendkeys(obj.getAdactpage().getDatepickinele(), "27/07/2023");
		elementclear(obj.getAdactpage().getDatepickoutele());
		sendkeys(obj.getAdactpage().getDatepickoutele(), "01/08/2023");
	}

	@Given("Select Noof-adults as in test")
	public void select_noof_adults_as_in_test() throws InterruptedException {
		elementclick(obj.getAdactpage().getAdultroomele());
		dropdown(obj.getAdactpage().getAdultroomele(), 1);
	}

	@Given("Select No-ofchildren as in test")
	public void select_no_ofchildren_as_in_test() throws InterruptedException {
		elementclick(obj.getAdactpage().getChildroomele());
		dropdown(obj.getAdactpage().getChildroomele(), 0);
	}

	@Given("Click on Search Button")
	public void click_on_search_button() {
		elementclick(obj.getAdactpage().getSearch());
	}

	@Given("Verify that hotel displayed is the same as selected in search Hotel form.")
	public void verify_that_hotel_displayed_is_the_same_as_selected_in_search_hotel_form() throws IOException {
		implicitwait(10);
		String actual = obj.getAdactpage().getHotalnameele().getAttribute("value");
		System.out.println(actual);
		File f = new File("C:\\Users\\Asus\\Desktop\\adactin.xlsx");
		FileInputStream fileInputStream = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fileInputStream);
		DataFormatter data = new DataFormatter();
		System.out.println(expected);
		String cell = wb.getSheetAt(0).getRow(0).getCell(0).getStringCellValue();
		Assert.assertEquals(expected, cell);
	}

//	=============================@TC-105==================================================

	@Given("location as in testt")
	public void location_as_in_testt() throws InterruptedException {
		implicitwait(10);
		elementclick(obj.getAdactpage().getLocationele());
		dropdown(obj.getAdactpage().getLocationele(), 1);

	}

	@Given("Select hotel as in testt")
	public void select_hotel_as_in_testt() throws InterruptedException {
		elementclick(obj.getAdactpage().getHotelsele());
		dropdown(obj.getAdactpage().getHotelsele(), 1);
	}

	@Given("Select room type as in testt")
	public void select_room_type_as_in_testt() throws InterruptedException {
		elementclick(obj.getAdactpage().getRoomtypeele());
		dropdown(obj.getAdactpage().getRoomtypeele(), 1);
	}

	@Given("Select noof-rooms as in testt")
	public void select_noof_rooms_as_in_testt() throws InterruptedException {
		elementclick(obj.getAdactpage().getRoomtypeele());
		dropdown(obj.getAdactpage().getRoomtypeele(), 1);
	}

	@Given("Enter checkout-date as in testt")
	public void enter_checkout_date_as_in_testt() {
		elementclear(obj.getAdactpage().getDatepickinele());
		sendkeys(obj.getAdactpage().getDatepickinele(), "27/07/2023");
		elementclear(obj.getAdactpage().getDatepickoutele());
		sendkeys(obj.getAdactpage().getDatepickoutele(), "01/08/2023");
	}

	@Given("Select Noof-adults as in testt")
	public void select_noof_adults_as_in_testt() throws InterruptedException {
		elementclick(obj.getAdactpage().getAdultroomele());
		dropdown(obj.getAdactpage().getAdultroomele(), 1);
	}

	@Given("Select No-ofchildren as in testt")
	public void select_no_ofchildren_as_in_testt() throws InterruptedException {
		elementclick(obj.getAdactpage().getChildroomele());
		dropdown(obj.getAdactpage().getChildroomele(), 0);
	}

	@Given("Click on Searchh Button")
	public void click_on_searchh_button() {
		attribute = obj.getAdactpage().getCheckindate().getAttribute("value");
		attribute2 = obj.getAdactpage().getCheckoutdate().getAttribute("value");
		elementclick(obj.getAdactpage().getSearch());

	}

	@Given("Verify that check-in-date and check-outdates are the same as selected in search hotel form.")
	public void verify_that_check_in_date_and_check_outdates_are_the_same_as_selected_in_search_hotel_form() {
		implicitwait(10);
		String attribute3 = obj.getSelecthotalp().getArrivaldate().getAttribute("value");
		String attribute4 = obj.getSelecthotalp().getDeparturedate().getAttribute("value");
		Assert.assertEquals(attribute, attribute3);
		Assert.assertEquals(attribute2, attribute4);	
	}

	
	
	
	
	//============================@TC-106===========================================	

	@Given("location as in teest")
	public void location_as_in_teest() throws InterruptedException {
		implicitwait(10);
		elementclick(obj.getAdactpage().getLocationele());
		dropdown(obj.getAdactpage().getLocationele(), 1);
	}

	@Given("Select hotel as in teest")
	public void select_hotel_as_in_teest() throws InterruptedException {
		elementclick(obj.getAdactpage().getHotelsele());
		dropdown(obj.getAdactpage().getHotelsele(), 1);
	}

	@Given("Select room type as in teest")
	public void select_room_type_as_in_teest() throws InterruptedException {
		elementclick(obj.getAdactpage().getRoomtypeele());
		dropdown(obj.getAdactpage().getRoomtypeele(), 1);
	}

	@Given("Select noof-rooms as in teest")
	public void select_noof_rooms_as_in_teest() throws InterruptedException {
		elementclick(obj.getAdactpage().getRoomtypeele());
		dropdown(obj.getAdactpage().getNoofroomsele(), 3);
		String rep= obj.getAdactpage().getNoofroom().getText();
		noofrooms = rep.replaceAll("[^0-9]", "");
	}

	@Given("Enter checkout-date as in teest")
	public void enter_checkout_date_as_in_teest() {
		elementclear(obj.getAdactpage().getDatepickinele());
		sendkeys(obj.getAdactpage().getDatepickinele(), "27/07/2023");
		elementclear(obj.getAdactpage().getDatepickoutele());
		sendkeys(obj.getAdactpage().getDatepickoutele(), "21/08/2023");
	}

	@Given("Select Noof-adults as in teest")
	public void select_noof_adults_as_in_teest() throws InterruptedException {
		elementclick(obj.getAdactpage().getAdultroomele());
		dropdown(obj.getAdactpage().getAdultroomele(), 1);
	}

	@Given("Select No-ofchildren as in teest")
	public void select_no_ofchildren_as_in_teest() throws InterruptedException {
		elementclick(obj.getAdactpage().getChildroomele());
		dropdown(obj.getAdactpage().getChildroomele(), 0);
	}

	@Given("Click on Searcch Button")
	public void click_on_searcch_button() {
		elementclick(obj.getAdactpage().getSearch());
	}

	@Given("Verify that no. of rooms reflected according to the no. of rooms selected in search hotel page")
	public void verify_that_no_of_rooms_reflected_according_to_the_no_of_rooms_selected_in_search_hotel_page() {
		String value = obj.getSelecthotalp().getNoofroomsinslecthotal().getAttribute("value");
		noofroomsinhotalselect = value.replaceAll("[^0-9]", "");
		Assert.assertEquals(noofrooms,noofroomsinhotalselect);
	
	
	
	}
	
	
	
	//============================@TC-107===========================================	
	
	
	@Given("location as in tesst")
	public void location_as_in_tesst() throws InterruptedException {
		implicitwait(10);
		elementclick(obj.getAdactpage().getLocationele());
		dropdown(obj.getAdactpage().getLocationele(), 1);
	}

	@Given("Select hotel as in tesst")
	public void select_hotel_as_in_tesst() throws InterruptedException {
		elementclick(obj.getAdactpage().getHotelsele());
		dropdown(obj.getAdactpage().getHotelsele(), 1);
	}

	@Given("Select room type as in tesst")
	public void select_room_type_as_in_tesst() throws InterruptedException {
		elementclick(obj.getAdactpage().getRoomtypeele());
		dropdown(obj.getAdactpage().getRoomtypeele(), 1);
		roomtypestandard = obj.getAdactpage().getRoomtypstand().getText();
	}

	@Given("Select noof-rooms as in tesst")
	public void select_noof_rooms_as_in_tesst() throws InterruptedException {
		elementclick(obj.getAdactpage().getRoomtypeele());
		dropdown(obj.getAdactpage().getNoofroomsele(), 1);
	}

	@Given("Enter checkout-date as in tesst")
	public void enter_checkout_date_as_in_tesst() {
		elementclear(obj.getAdactpage().getDatepickinele());
		sendkeys(obj.getAdactpage().getDatepickinele(), "27/07/2023");
		elementclear(obj.getAdactpage().getDatepickoutele());
		sendkeys(obj.getAdactpage().getDatepickoutele(), "28/07/2023");
	}

	@Given("Select Noof-adults as in tesst")
	public void select_noof_adults_as_in_tesst() throws InterruptedException {
		elementclick(obj.getAdactpage().getAdultroomele());
		dropdown(obj.getAdactpage().getAdultroomele(), 1);
	}

	@Given("Select No-ofchildren as in tesst")
	public void select_no_ofchildren_as_in_tesst() throws InterruptedException {
		elementclick(obj.getAdactpage().getChildroomele());
		dropdown(obj.getAdactpage().getChildroomele(), 0);
	}

	@Given("Click on Searrch Button")
	public void click_on_searrch_button() {
		elementclick(obj.getAdactpage().getSearch());
	}

	@Given("Verify that room type reflected is the same as selected in search hotel page.")
	public void verify_that_room_type_reflected_is_the_same_as_selected_in_search_hotel_page() {
	    selecthotalroomtypestand = obj.getSelecthotalp().getRoomtypestand().getAttribute("value");
	    Assert.assertEquals(roomtypestandard, selecthotalroomtypestand);
	}
//============================@TC-108===========================================	

	@Given("Select location as in test datas.")
	public void select_location_as_in_test_datas() throws InterruptedException {
		implicitwait(10);
		elementclick(obj.getAdactpage().getLocationele());
		dropdown(obj.getAdactpage().getLocationele(), 1);
	}

	@Given("Select hotel as in a test datas")
	public void select_hotel_as_in_a_test_datas() throws InterruptedException {
		gettext(obj.getAdactpage().getHotelcreekele());
		dropdown(obj.getAdactpage().getHotelsele(), 1);
	}

	@Given("Select roomtype as in test data")
	public void select_roomtype_as_in_test_data() throws InterruptedException {
		elementclick(obj.getAdactpage().getRoomtypeele());
		dropdown(obj.getAdactpage().getRoomtypeele(), 1);
	}

	@Given("Select no of rooms as in test data")
	public void select_no_of_rooms_as_in_test_data() throws InterruptedException {
		elementclick(obj.getAdactpage().getRoomtypeele());
		dropdown(obj.getAdactpage().getRoomtypeele(), 1);
	}

	@Given("Enter check out date as in test data")
	public void enter_check_out_date_as_in_test_data() {
		elementclear(obj.getAdactpage().getDatepickinele());
		sendkeys(obj.getAdactpage().getDatepickinele(), "27/07/2023");
		elementclear(obj.getAdactpage().getDatepickoutele());
		sendkeys(obj.getAdactpage().getDatepickoutele(), "28/07/2023");
	}

	@Given("Select no of adults as in test data")
	public void select_no_of_adults_as_in_test_data() throws InterruptedException {
		elementclick(obj.getAdactpage().getAdultroomele());
		dropdown(obj.getAdactpage().getAdultroomele(), 1);
	}

	@Given("Select no. of children as in test data")
	public void select_no_of_children_as_in_test_data() throws InterruptedException {
		elementclick(obj.getAdactpage().getChildroomele());
		dropdown(obj.getAdactpage().getChildroomele(), 0);
	}

	@Given("Click on search butto")
	public void click_on_search_butto() {
		elementclick(obj.getAdactpage().getSearch());
	}

	@Given("Select the hotel and click continue button")
	public void select_the_hotel_and_click_continue_button() {
		implicitwait(10);
		elementclick(obj.getSelecthotalp().getRadiobuttonele());
		elementclick(obj.getSelecthotalp().getSearchele());
	}

	@Given("Verify the total price\\(excl GST) is being calculated as \\(price-pernight*no-ofrooms*no-ofdays)")
	public void verify_the_total_price_excl_gst_is_being_calculated_as_price_pernight_no_ofrooms_no_ofdays() {

		String numberofrooms = obj.getBookhotalp().getNumofrooms().getAttribute("value");
		String nofrooms = numberofrooms.replaceAll("[^0-9]", "");

		String numberofdays = obj.getBookhotalp().getNumofdays().getAttribute("value");
		String nofdays = numberofdays.replaceAll("[^0-9]", "");

		String pricepnight = obj.getBookhotalp().getPricepernight().getAttribute("value");
		String ppnight = pricepnight.replaceAll("[^0-9]", "");

		String totalp = obj.getBookhotalp().getTotalprice().getAttribute("value");
		String tprice = totalp.replaceAll("[^0-9]", "");

		int intnroom = Integer.parseInt(nofrooms);
		int intndays = Integer.parseInt(nofdays);
		int intppnight = Integer.parseInt(ppnight);
		int intexprice = intndays * intnroom * intppnight;
		int inttprice = Integer.parseInt(tprice);

		if (intnroom * intndays * intppnight == inttprice) {
			System.out.println("Displayed total price is " + inttprice);
			System.out.println("Actual price met the displayed Totalprice");
		} else if (intnroom * intndays * intppnight != inttprice) {
			System.out.println("Actual total price is " + intexprice);
			System.err.println("Displayed total price is " + inttprice);
			System.out.println("Actual price does not met the displayed Totalprice");
			Assert.fail();
		}

	}

//	==============================@TC-109================================================

	@Given("Select location as in test data")
	public void select_location_as_in_test_data() throws InterruptedException {
		implicitwait(10);
		elementclick(obj.getAdactpage().getLocationele());
		dropdown(obj.getAdactpage().getLocationele(), 1);
	}

	@Given("Select hotel as in test data")
	public void select_hotel_as_in_test_data() throws InterruptedException {
		dropdown(obj.getAdactpage().getHotelsele(), 1);
	}

	@Given("Select room type as in test data")
	public void select_room_type_as_in_test_data() throws InterruptedException {
		elementclick(obj.getAdactpage().getRoomtypeele());
		dropdown(obj.getAdactpage().getRoomtypeele(), 1);
	}

	@Given("Select no-ofrooms as in test data")
	public void select_no_ofrooms_as_in_test_data() throws InterruptedException {
		elementclick(obj.getAdactpage().getRoomtypeele());
		dropdown(obj.getAdactpage().getRoomtypeele(), 1);
	}

	@Given("Enter checkout-date as in test data")
	public void enter_checkout_date_as_in_test_data() {
		elementclear(obj.getAdactpage().getDatepickinele());
		sendkeys(obj.getAdactpage().getDatepickinele(), "27/07/2023");
		elementclear(obj.getAdactpage().getDatepickoutele());
		sendkeys(obj.getAdactpage().getDatepickoutele(), "28/07/2023");
	}

	@Given("Select No-ofadults as in test data")
	public void select_no_ofadults_as_in_test_data() throws InterruptedException {
		elementclick(obj.getAdactpage().getAdultroomele());
		dropdown(obj.getAdactpage().getAdultroomele(), 1);
	}

	@Given("Select No-ofchildren as in test data")
	public void select_no_ofchildren_as_in_test_data() throws InterruptedException {
		elementclick(obj.getAdactpage().getChildroomele());
		dropdown(obj.getAdactpage().getChildroomele(), 0);
	}

	@Given("Click on Search the Button.")
	public void click_on_search_the_button() {
		elementclick(obj.getAdactpage().getSearch());
	}

	@Given("Select the hotel and click on continue button")
	public void select_the_hotel_and_click_on_continue_button() throws InterruptedException {
		implicitwait(10);
		elementclick(obj.getSelecthotalp().getRadiobuttonele());
		elementclick(obj.getSelecthotalp().getSearchele());
	}

	@Given("Enter he details and click on book now")
	public void enter_he_details_and_click_on_book_now() throws InterruptedException {
		implicitwait(10);
		sendkeys(obj.getBookhotalp().getNameele(), "Anand");
		sendkeys(obj.getBookhotalp().getLastnameele(), "M");
		sendkeys(obj.getBookhotalp().getAddressele(), "7/123,Abirami nagar");
		sendkeys(obj.getBookhotalp().getCreditcardnumele(), "1234567891234567");
		dropdown(obj.getBookhotalp().getCreditcarttypeele(), 4);
		dropdown(obj.getBookhotalp().getExpirymonthele(), 12);
		dropdown(obj.getBookhotalp().getExpiryyearele(), 12);
		sendkeys(obj.getBookhotalp().getCvvnumele(), "123");
		elementclick(obj.getBookhotalp().getBooknowbutton());
	}

	@Given("Check the details,click on logout and verify if we have logged out from the ap")
	public void check_the_details_click_on_logout_and_verify_if_we_have_logged_out_from_the_ap()
			throws InterruptedException {
		implicitwait(10);
		elementclick(obj.getBookhotalp().getLogoutele());
		implicitwait(10);
		isdisplay(obj.getSelecthotalp().getLogoutdisele());
	}

//	==========================@TC-110====================================

	@Given("Select location a in test data")
	public void select_location_a_in_test_data() throws InterruptedException {
		implicitwait(10);
		elementclick(obj.getAdactpage().getLocationele());
		dropdown(obj.getAdactpage().getLocationele(), 2);
	}

	@Given("Select hotel a in test data")
	public void select_hotel_a_in_test_data() throws InterruptedException {
		dropdown(obj.getAdactpage().getHotelsele(), 1);
	}

	@Given("Select room type a in test data")
	public void select_room_type_a_in_test_data() throws InterruptedException {
		elementclick(obj.getAdactpage().getRoomtypeele());
		dropdown(obj.getAdactpage().getRoomtypeele(), 1);
	}

	@Given("Select no-ofrooms a in test data")
	public void select_no_ofrooms_a_in_test_data() throws InterruptedException {
		elementclick(obj.getAdactpage().getRoomtypeele());
		dropdown(obj.getAdactpage().getNoofroomsele(), 2);
	}

	@Given("Enter checkout-date a in test data")
	public void enter_checkout_date_a_in_test_data() {
		elementclear(obj.getAdactpage().getDatepickinele());
		sendkeys(obj.getAdactpage().getDatepickinele(), "27/02/2023");
		elementclear(obj.getAdactpage().getDatepickoutele());
		sendkeys(obj.getAdactpage().getDatepickoutele(), "28/02/2023");
	}

	@Given("Select No-ofadults a in test data")
	public void select_no_ofadults_a_in_test_data() throws InterruptedException {
		elementclick(obj.getAdactpage().getAdultroomele());
		dropdown(obj.getAdactpage().getAdultroomele(), 1);
	}

	@Given("Select No-ofchildren a in test data")
	public void select_no_ofchildren_a_in_test_data() throws InterruptedException {
		elementclick(obj.getAdactpage().getChildroomele());
		dropdown(obj.getAdactpage().getChildroomele(), 0);
	}

	@Given("Click o Search the Button.")
	public void click_o_search_the_button() {
		elementclick(obj.getAdactpage().getSearch());
	}

	@Given("Select the hotel and click o continue button")
	public void select_the_hotel_and_click_o_continue_button() {
		implicitwait(10);
		elementclick(obj.getSelecthotalp().getRadiobuttonele());
		elementclick(obj.getSelecthotalp().getSearchele());
	}

	@Given("Verify that total-price is being calculated as price-pernight")
	public void verify_that_total_price_is_being_calculated_as_price_pernight() {
		String numberofrooms = obj.getBookhotalp().getNumofrooms().getAttribute("value");
		String nofrooms = numberofrooms.replaceAll("[^0-9]", "");

		String numberofdays = obj.getBookhotalp().getNumofdays().getAttribute("value");
		String nofdays = numberofdays.replaceAll("[^0-9]", "");

		String pricepnight = obj.getBookhotalp().getPricepernight().getAttribute("value");
		String ppnight = pricepnight.replaceAll("[^0-9]", "");

		String totalp = obj.getBookhotalp().getTotalprice().getAttribute("value");
		String tprice = totalp.replaceAll("[^0-9]", "");

		int intnroom = Integer.parseInt(nofrooms);
		int intndays = Integer.parseInt(nofdays);
		int intppnight = Integer.parseInt(ppnight);
		int intexprice = intndays * intnroom * intppnight;
		double expectedprice = (intexprice * 10 / 100 + intexprice);

		int inttprice = Integer.parseInt(tprice);
		if (expectedprice == inttprice) {
			System.out.println("Displayed total price is " + inttprice);
			System.out.println("Actual price met the displayed Totalprice");
		} else if (expectedprice != inttprice) {
			System.out.println("Actual total price is " + expectedprice);
			System.err.println("Displayed total price is " + inttprice);
			System.out.println("Actual price does not met the displayed Totalprice");
			Assert.fail();

		}

	}
	
	//=============================@TC-111====================================================	

	
	@Given("Select locationn a in test data")
	public void select_locationn_a_in_test_data() throws InterruptedException {
		implicitwait(10);
		elementclick(obj.getAdactpage().getLocationele());
		dropdown(obj.getAdactpage().getLocationele(), 1);
	}
	@Given("Select hotell a in test data")
	public void select_hotell_a_in_test_data() throws InterruptedException {
		dropdown(obj.getAdactpage().getHotelsele(), 1);
	}
	@Given("Select room typee a in test data")
	public void select_room_typee_a_in_test_data() throws InterruptedException {
		elementclick(obj.getAdactpage().getRoomtypeele());
		dropdown(obj.getAdactpage().getRoomtypeele(), 1);
	}
	@Given("Select no-ofroomms a in test data")
	public void select_no_ofroomms_a_in_test_data() throws InterruptedException {
		elementclick(obj.getAdactpage().getRoomtypeele());
		dropdown(obj.getAdactpage().getNoofroomsele(), 2);
	}
	@Given("Enter checkout-datte a in test data")
	public void enter_checkout_datte_a_in_test_data() {
		elementclear(obj.getAdactpage().getDatepickinele());
		sendkeys(obj.getAdactpage().getDatepickinele(), "27/02/2023");
		elementclear(obj.getAdactpage().getDatepickoutele());
		sendkeys(obj.getAdactpage().getDatepickoutele(), "28/02/2023");
	}
	@Given("Select No-ofadultss a in test data")
	public void select_no_ofadultss_a_in_test_data() throws InterruptedException {
		elementclick(obj.getAdactpage().getAdultroomele());
		dropdown(obj.getAdactpage().getAdultroomele(), 1);
	}
	@Given("Select No-ofchildrenn a in test data")
	public void select_no_ofchildrenn_a_in_test_data() throws InterruptedException {
		elementclick(obj.getAdactpage().getChildroomele());
		dropdown(obj.getAdactpage().getChildroomele(), 0);
	}
	@Given("Click o Searcch the Button.")
	public void click_o_searcch_the_button() {
		elementclick(obj.getAdactpage().getSearch());
	}
	@Given("Select the hotel and clicck o continue button")
	public void select_the_hotel_and_clicck_o_continue_button() {
		implicitwait(10);
		elementclick(obj.getSelecthotalp().getRadiobuttonele());
		elementclick(obj.getSelecthotalp().getSearchele());
	}
	@Given("Verify that total-price is being calculatted as price-pernight*no-ofrooms*no-ofdays")
	public void verify_that_total_price_is_being_calculatted_as_price_pernight_no_ofrooms_no_ofdays() {

	String nofroom = obj.getBookhotalp().getNumofrooms().getAttribute("value");
	String nofdays = obj.getBookhotalp().getNumofdays().getAttribute("value");
	String pricepernight = obj.getBookhotalp().getPricepernight().getAttribute("value");
	String totalprice = obj.getBookhotalp().getTotalprice().getAttribute("value");
	
	String nofroomm = nofroom.replaceAll("[^0-9]", "");
	String nofdayss = nofdays.replaceAll("[^0-9]", "");
	String pricepernights = pricepernight.replaceAll("[^0-9]", "");
	String totalpricee = totalprice.replaceAll("[^0-9]", "");
	
int nroom = Integer.parseInt(nofroomm);	
	int ndays = Integer.parseInt(nofdayss);
	int pricenight = Integer.parseInt(pricepernights);
	
	int actualprice = (nroom*ndays*pricenight);
	Assert.assertEquals(actualprice, totalpricee);
	
	}
//=============================@TC-112====================================================	
	@Given("Select loca.tion a in test data")
	public void select_loca_tion_a_in_test_data() throws InterruptedException {
		implicitwait(10);
		elementclick(obj.getAdactpage().getLocationele());
		dropdown(obj.getAdactpage().getLocationele(), 1);
	}

	@Given("Select hotel a i. test data")
	public void select_hotel_a_i_test_data() throws InterruptedException {
		dropdown(obj.getAdactpage().getHotelsele(), 1);
	}

	@Given("Select room. typ a in test data")
	public void select_room_typ_a_in_test_data() throws InterruptedException {
		elementclick(obj.getAdactpage().getRoomtypeele());
		dropdown(obj.getAdactpage().getRoomtypeele(), 1);
	}

	@Given("Select no-ofroo.ms a in test data")
	public void select_no_ofroo_ms_a_in_test_data() throws InterruptedException {
		elementclick(obj.getAdactpage().getRoomtypeele());
		dropdown(obj.getAdactpage().getNoofroomsele(), 2);
	}

	@Given("Enter chec.kout-date a in test data")
	public void enter_chec_kout_date_a_in_test_data() {
		elementclear(obj.getAdactpage().getDatepickinele());
		sendkeys(obj.getAdactpage().getDatepickinele(), "27/07/2023");
		elementclear(obj.getAdactpage().getDatepickoutele());
		sendkeys(obj.getAdactpage().getDatepickoutele(), "28/07/2023");
	}

	@Given("Select No-ofadult. a in test data")
	public void select_no_ofadult_a_in_test_data() throws InterruptedException {
		elementclick(obj.getAdactpage().getAdultroomele());
		dropdown(obj.getAdactpage().getAdultroomele(), 1);
	}

	@Given("Select No-of.children a in test data")
	public void select_no_of_children_a_in_test_data() throws InterruptedException {
		elementclick(obj.getAdactpage().getChildroomele());
		dropdown(obj.getAdactpage().getChildroomele(), 0);
	}

	@Given("Click o Search. th Button.")
	public void click_o_search_th_button() {
		elementclick(obj.getAdactpage().getSearch());
	}

	@Given("Select the. hotel and click o continu button")
	public void select_the_hotel_and_click_o_continu_button() {
		implicitwait(10);
		elementclick(obj.getSelecthotalp().getRadiobuttonele());
		elementclick(obj.getSelecthotalp().getSearchele());
	}

	@Given("Verify that total-price is. being calculated")
	public void verify_that_total_price_is_being_calculated() {
		String numberofrooms = obj.getBookhotalp().getNumofrooms().getAttribute("value");
		String nofrooms = numberofrooms.replaceAll("[^0-9]", "");

		String numberofdays = obj.getBookhotalp().getNumofdays().getAttribute("value");
		String nofdays = numberofdays.replaceAll("[^0-9]", "");

		String pricepnight = obj.getBookhotalp().getPricepernight().getAttribute("value");
		String ppnight = pricepnight.replaceAll("[^0-9]", "");

		String finalbill = obj.getBookhotalp().getFinalbillprice().getAttribute("value");
		String fprice = finalbill.replaceAll("[^0-9]", "");

		int intnroom = Integer.parseInt(nofrooms);
		int intndays = Integer.parseInt(nofdays);
		int intppnight = Integer.parseInt(ppnight);
		int intexprice = intndays * intnroom * intppnight;
		double expectedprice = (intexprice * 10 / 100 + intexprice);

		int ffprice = Integer.parseInt(fprice);
		int inttprice = ffprice / 10;
		if (expectedprice == inttprice) {
			System.out.println("Displayed Billed price is " + inttprice);
			System.out.println("Actual Billed price met the displayed Totalprice");
		} else if (expectedprice != inttprice) {
			System.out.println("Actual Billed price is " + expectedprice);
			System.err.println("Displayed Billed price is " + inttprice);
			System.out.println("Actual price does not met the displayed Billed price");
			Assert.fail();

		}

	}
	
	
	//=============================@TC-113====================================================	
	
	@Given("Select loca.tion a in tesft data")
	public void select_loca_tion_a_in_tesft_data() throws InterruptedException {
		implicitwait(10);
		elementclick(obj.getAdactpage().getLocationele());
		dropdown(obj.getAdactpage().getLocationele(), 1);

	}
	@Given("Select hotel a i. tesft data")
	public void select_hotel_a_i_tesft_data() throws InterruptedException {
		dropdown(obj.getAdactpage().getHotelsele(), 1);

	}
	@Given("Select room. typ a in tesft data")
	public void select_room_typ_a_in_tesft_data() throws InterruptedException {
		elementclick(obj.getAdactpage().getRoomtypeele());
		dropdown(obj.getAdactpage().getRoomtypeele(), 1);
	}
	@Given("Select no-ofroo.ms a in tesft data")
	public void select_no_ofroo_ms_a_in_tesft_data() throws InterruptedException {
		elementclick(obj.getAdactpage().getRoomtypeele());
		dropdown(obj.getAdactpage().getNoofroomsele(), 2);
	}
	@Given("Enter chec.kout-date a in tesft data")
	public void enter_chec_kout_date_a_in_tesft_data() {
		elementclear(obj.getAdactpage().getDatepickinele());
		sendkeys(obj.getAdactpage().getDatepickinele(), "27/07/2023");
		elementclear(obj.getAdactpage().getDatepickoutele());
		sendkeys(obj.getAdactpage().getDatepickoutele(), "28/07/2023");
	}
	@Given("Select No-ofadult. a in tesft data")
	public void select_no_ofadult_a_in_tesft_data() throws InterruptedException {
		elementclick(obj.getAdactpage().getAdultroomele());
		dropdown(obj.getAdactpage().getAdultroomele(), 1);
	}
	@Given("Select No-of.children a in tesft data")
	public void select_no_of_children_a_in_tesft_data() throws InterruptedException {
		elementclick(obj.getAdactpage().getChildroomele());
		dropdown(obj.getAdactpage().getChildroomele(), 0);
	}
	@Given("Click o Search. thr Button.")
	public void click_o_search_thr_button() {
		elementclick(obj.getAdactpage().getSearch());

	}
	@Given("Select the. hotel and click o continuf button")
	public void select_the_hotel_and_click_o_continuf_button() {
		implicitwait(10);
		elementclick(obj.getSelecthotalp().getRadiobuttonele());
		elementclick(obj.getSelecthotalp().getSearchele());
	}
	@Given("Verify that total-price is being calculated as pprice-pernight*no-ofrooms*no-ofdays")
	public void verify_that_total_price_is_being_calculated_as_pprice_pernight_no_ofrooms_no_ofdays() {

		String nofroom = obj.getBookhotalp().getNumofrooms().getAttribute("value");
		String nofdays = obj.getBookhotalp().getNumofdays().getAttribute("value");
		String pricepernight = obj.getBookhotalp().getPricepernight().getAttribute("value");
		String totalprice = obj.getBookhotalp().getTotalprice().getAttribute("value");
		
		String nofroomm = nofroom.replaceAll("[^0-9]", "");
		String nofdayss = nofdays.replaceAll("[^0-9]", "");
		String pricepernights = pricepernight.replaceAll("[^0-9]", "");
		String totalpricee = totalprice.replaceAll("[^0-9]", "");
		
		int nroom = Integer.parseInt(nofroomm);	
		int ndays = Integer.parseInt(nofdayss);
		int pricenight = Integer.parseInt(pricepernights);
	
		int actualprice = (nroom*ndays*pricenight);
		System.out.println(actualprice);
		System.out.println(totalpricee);
		Assert.assertEquals(actualprice, totalpricee);
		}
	
	//=============================@TC-114====================================================	
	
	@Given("Select loca.tion a in tesgt data")
	public void select_loca_tion_a_in_tesgt_data() throws InterruptedException {
		implicitwait(10);
		dropdown(obj.getAdactpage().getLocationele(), 1);
	}
	@Given("Select hotel a i. tesgt data")
	public void select_hotel_a_i_tesgt_data() throws InterruptedException {
		dropdown(obj.getAdactpage().getHotelsele(), 1);
	}
	@Given("Select room. typ a in tesgt data")
	public void select_room_typ_a_in_tesgt_data() throws InterruptedException {
		dropdown(obj.getAdactpage().getRoomtypeele(), 1);
	}
	@Given("Select no-ofroo.ms a in tesgt data")
	public void select_no_ofroo_ms_a_in_tesgt_data() throws InterruptedException {
		dropdown(obj.getAdactpage().getNoofroomsele(), 2);
	}
	@Given("Enter chec.kout-date a in tesgt data")
	public void enter_chec_kout_date_a_in_tesgt_data() {
		elementclear(obj.getAdactpage().getDatepickinele());
		sendkeys(obj.getAdactpage().getDatepickinele(), "27/07/2023");
		elementclear(obj.getAdactpage().getDatepickoutele());
		sendkeys(obj.getAdactpage().getDatepickoutele(), "28/07/2023");
	}
	@Given("Select No-ofadult. a in tesgt data")
	public void select_no_ofadult_a_in_tesgt_data() throws InterruptedException {
		dropdown(obj.getAdactpage().getAdultroomele(), 1);
	}
	@Given("Select No-of.children a in tesgt data")
	public void select_no_of_children_a_in_tesgt_data() throws InterruptedException {
		dropdown(obj.getAdactpage().getChildroomele(), 0);
	}
	@Given("Click o Search. thg Button.")
	public void click_o_search_thg_button() {
		elementclick(obj.getAdactpage().getSearch());

	}
	@Given("Select the. hotel and click o continug button")
	public void select_the_hotel_and_click_o_continug_button() {
		implicitwait(10);
		elementclick(obj.getSelecthotalp().getRadiobuttonele());
		elementclick(obj.getSelecthotalp().getSearchele());
	}
	@Given("Verify that total-price is being calculated as gprice-pernight*no-ofrooms*no-ofdays")
	public void verify_that_total_price_is_being_calculated_as_gprice_pernight_no_ofrooms_no_ofdays() {
		String nofroom = obj.getBookhotalp().getNumofrooms().getAttribute("value");
		String nofdays = obj.getBookhotalp().getNumofdays().getAttribute("value");
		String pricepernight = obj.getBookhotalp().getPricepernight().getAttribute("value");
		String totalprice = obj.getBookhotalp().getTotalprice().getAttribute("value");
		
		String nofroomm = nofroom.replaceAll("[^0-9]", "");
		String nofdayss = nofdays.replaceAll("[^0-9]", "");
		String pricepernights = pricepernight.replaceAll("[^0-9]", "");
		String totalpricee = totalprice.replaceAll("[^0-9]", "");
		
		int nroom = Integer.parseInt(nofroomm);	
		int ndays = Integer.parseInt(nofdayss);
		int pricenight = Integer.parseInt(pricepernights);

		int actualprice = (nroom*ndays*pricenight);
//		System.out.println(actualprice);
//		System.out.println(totalpricee);
//		Assert.assertEquals(actualprice, totalpricee);
		
		
	}
	@Given("Verify Order number is generate d in booking confirmation page")
	public void verify_order_number_is_generate_d_in_booking_confirmation_page() throws InterruptedException {
		
		implicitwait(10);
		sendkeys(obj.getBookhotalp().getNameele(), "Anand");
		sendkeys(obj.getBookhotalp().getLastnameele(), "M");
		sendkeys(obj.getBookhotalp().getAddressele(), "7/123,Abirami nagar");
		sendkeys(obj.getBookhotalp().getCreditcardnumele(), "1234567891234567");
		dropdown(obj.getBookhotalp().getCreditcarttypeele(), 4);
		dropdown(obj.getBookhotalp().getExpirymonthele(), 12);
		dropdown(obj.getBookhotalp().getExpiryyearele(), 12);
		sendkeys(obj.getBookhotalp().getCvvnumele(), "123");
		elementclick(obj.getBookhotalp().getBooknowbutton());
		implicitwait(10);		
	   isdisplay(obj.getBooking_Confirmationpage().getOrderno());
	}
	
	
	//=============================@TC-115====================================================	
	
	
	@Given("Select locaation a in tesgt data")
	public void select_locaation_a_in_tesgt_data() throws InterruptedException {
		implicitwait(10);
		dropdown(obj.getAdactpage().getLocationele(), 1);
	}
	@Given("Select hotels in tesgt data")
	public void select_hotels_in_tesgt_data() throws InterruptedException {
		dropdown(obj.getAdactpage().getHotelsele(), 1);

	}
	@Given("Select roomy typ a in tesgt data")
	public void select_roomy_typ_a_in_tesgt_data() throws InterruptedException {
		dropdown(obj.getAdactpage().getRoomtypeele(), 1);

	}
	@Given("Select no-ofyroo.ms a in tesgt data")
	public void select_no_ofyroo_ms_a_in_tesgt_data() throws InterruptedException {
		dropdown(obj.getAdactpage().getNoofroomsele(), 2);

	}
	@Given("Enter chec.yout-date a in tesgt data")
	public void enter_chec_yout_date_a_in_tesgt_data() {
		elementclear(obj.getAdactpage().getDatepickinele());
		sendkeys(obj.getAdactpage().getDatepickinele(), "27/07/2023");
		elementclear(obj.getAdactpage().getDatepickoutele());
		sendkeys(obj.getAdactpage().getDatepickoutele(), "28/07/2023");
	}
	@Given("Select No-ofyadult. a in tesgt data")
	public void select_no_ofyadult_a_in_tesgt_data() throws InterruptedException {
		dropdown(obj.getAdactpage().getAdultroomele(), 1);

	}
	@Given("Select No-of.chyildren a in tesgt data")
	public void select_no_of_chyildren_a_in_tesgt_data() throws InterruptedException {
		dropdown(obj.getAdactpage().getChildroomele(), 0);

	}
	@Given("Click o Searchy. thg Button.")
	public void click_o_searchy_thg_button() {
		elementclick(obj.getAdactpage().getSearch());

	}
	@Given("Select the. hotely and click o continug button")
	public void select_the_hotely_and_click_o_continug_button() {
		implicitwait(10);
		elementclick(obj.getSelecthotalp().getRadiobuttonele());
		elementclick(obj.getSelecthotalp().getSearchele());
	}
	@Given("Fill the form and click on Book now button")
	public void fill_the_form_and_click_on_book_now_button() throws InterruptedException {
		implicitwait(10);
		sendkeys(obj.getBookhotalp().getNameele(), "Anand");
		sendkeys(obj.getBookhotalp().getLastnameele(), "M");
		sendkeys(obj.getBookhotalp().getAddressele(), "7/123,Abirami nagar");
		sendkeys(obj.getBookhotalp().getCreditcardnumele(), "1234567891234567");
		dropdown(obj.getBookhotalp().getCreditcarttypeele(), 4);
		dropdown(obj.getBookhotalp().getExpirymonthele(), 12);
		dropdown(obj.getBookhotalp().getExpiryyearele(), 12);
		sendkeys(obj.getBookhotalp().getCvvnumele(), "123");
		elementclick(obj.getBookhotalp().getBooknowbutton());
	}
	@Given("Click on My itinerary button")
	public void click_on_my_itinerary_button() throws InterruptedException {
		implicitwait(10);
		elementclick(obj.getBooking_Confirmationpage().getMyitinebutton());
	}
	@Given("Verify that the details are not editable")
	public void verify_that_the_details_are_not_editable() {
		implicitwait(10);
		elementclear(obj.getBooked_Itenerarypage().getBookeditehotal());
		sendkeys(obj.getBooked_Itenerarypage().getBookeditehotal(), "anand");
		
		Assert.fail();
	}
	
	//=============================@TC-116====================================================	
	
	
	@Given("Select locaatiion a in tesgt data")
	public void select_locaatiion_a_in_tesgt_data() throws InterruptedException {
		implicitwait(10);
		elementclick(obj.getAdactpage().getLocationele());
		dropdown(obj.getAdactpage().getLocationele(), 1);
	}
	@Given("Select hotels in tesgt dataa")
	public void select_hotels_in_tesgt_dataa() throws InterruptedException {
		dropdown(obj.getAdactpage().getHotelsele(), 1);

	}
	@Given("Select roomy typ a in tesgt daata")
	public void select_roomy_typ_a_in_tesgt_daata() throws InterruptedException {
		elementclick(obj.getAdactpage().getRoomtypeele());
		dropdown(obj.getAdactpage().getRoomtypeele(), 1);
	}
	@Given("Select no-ofyroo.ms a in tesgt daata")
	public void select_no_ofyroo_ms_a_in_tesgt_daata() throws InterruptedException {
		elementclick(obj.getAdactpage().getRoomtypeele());
		dropdown(obj.getAdactpage().getNoofroomsele(), 2);
	}
	@Given("Enter chec.yout-date a in tesgt daata")
	public void enter_chec_yout_date_a_in_tesgt_daata() {
		elementclear(obj.getAdactpage().getDatepickinele());
		sendkeys(obj.getAdactpage().getDatepickinele(), "27/07/2023");
		elementclear(obj.getAdactpage().getDatepickoutele());
		sendkeys(obj.getAdactpage().getDatepickoutele(), "28/07/2023");
	}
	@Given("Select No-ofyadult. a in tesgt daata")
	public void select_no_ofyadult_a_in_tesgt_daata() throws InterruptedException {
		elementclick(obj.getAdactpage().getAdultroomele());
		dropdown(obj.getAdactpage().getAdultroomele(), 1);
	}
	@Given("Select No-of.chyildren a in tesgt daata")
	public void select_no_of_chyildren_a_in_tesgt_daata() throws InterruptedException {
		elementclick(obj.getAdactpage().getChildroomele());
		dropdown(obj.getAdactpage().getChildroomele(), 0);
	}
	@Given("Click o Searchy. thg Buttton.")
	public void click_o_searchy_thg_buttton() {
		elementclick(obj.getAdactpage().getSearch());

	}
	@Given("Select the. hotely and clicck o continug button")
	public void select_the_hotely_and_clicck_o_continug_button() {
		implicitwait(10);
		elementclick(obj.getSelecthotalp().getRadiobuttonele());
		elementclick(obj.getSelecthotalp().getSearchele());
	}
	@Given("Fill the form and click on Boook now button")
	public void fill_the_form_and_click_on_boook_now_button() throws InterruptedException {
		implicitwait(10);
		nameg = "Anand";
		lastnameg = "M";
		sendkeys(obj.getBookhotalp().getNameele(), nameg);
		sendkeys(obj.getBookhotalp().getLastnameele(), lastnameg);
		sendkeys(obj.getBookhotalp().getAddressele(), "7/123,Abirami nagar");
		sendkeys(obj.getBookhotalp().getCreditcardnumele(), "1234567891234567");
		dropdown(obj.getBookhotalp().getCreditcarttypeele(), 4);
		dropdown(obj.getBookhotalp().getExpirymonthele(), 12);
		dropdown(obj.getBookhotalp().getExpiryyearele(), 12);
		sendkeys(obj.getBookhotalp().getCvvnumele(), "123");
		elementclick(obj.getBookhotalp().getBooknowbutton());
	}
	@Given("Click on My itinerary buttton")
	public void click_on_my_itinerary_buttton() {
		implicitwait(10);
		elementclick(obj.getBooking_Confirmationpage().getMyitinebutton());
	}
	@Given("Verify that the details are rreflected correctly as per the booking")
	public void verify_that_the_details_are_rreflected_correctly_as_per_the_booking() {

		implicitwait(10);
		String name = obj.getBooked_Itenerarypage().getNameinbookeditenarele().getAttribute("value");
		String lastname = obj.getBooked_Itenerarypage().getLastnameinbookediternarele().getAttribute("value");	
		System.out.println(name);
		System.out.println(nameg);
		System.out.println(lastname);
		System.out.println(lastnameg);
		Assert.assertEquals(nameg, name);
		Assert.assertEquals(lastnameg, lastname);
	
	}
	
	//=============================@TC-117====================================================	

	
	@Given("Login to tzhe application using username and password as in test data.")
	public void login_to_tzhe_application_using_username_and_password_as_in_test_data() throws InterruptedException {
		implicitwait(10);
		elementclick(obj.getAdactpage().getLocationele());
		dropdown(obj.getAdactpage().getLocationele(), 1);
		dropdown(obj.getAdactpage().getHotelsele(), 1);
		elementclick(obj.getAdactpage().getRoomtypeele());
		dropdown(obj.getAdactpage().getRoomtypeele(), 1);
		elementclick(obj.getAdactpage().getRoomtypeele());
		dropdown(obj.getAdactpage().getNoofroomsele(), 2);
		elementclear(obj.getAdactpage().getDatepickinele());
		sendkeys(obj.getAdactpage().getDatepickinele(), "27/07/2023");
		elementclear(obj.getAdactpage().getDatepickoutele());
		sendkeys(obj.getAdactpage().getDatepickoutele(), "28/07/2023");
		elementclick(obj.getAdactpage().getAdultroomele());
		dropdown(obj.getAdactpage().getAdultroomele(), 1);
		elementclick(obj.getAdactpage().getChildroomele());
		dropdown(obj.getAdactpage().getChildroomele(), 0);
		elementclick(obj.getAdactpage().getSearch());
		implicitwait(10);
		elementclick(obj.getSelecthotalp().getRadiobuttonele());
		elementclick(obj.getSelecthotalp().getSearchele());
		implicitwait(10);	
		sendkeys(obj.getBookhotalp().getNameele(), "Anand");
		sendkeys(obj.getBookhotalp().getLastnameele(), "M");
		sendkeys(obj.getBookhotalp().getAddressele(), "7/123,Abirami nagar");
		sendkeys(obj.getBookhotalp().getCreditcardnumele(), "1234567891234567");
		dropdown(obj.getBookhotalp().getCreditcarttypeele(), 4);
		dropdown(obj.getBookhotalp().getExpirymonthele(), 12);
		dropdown(obj.getBookhotalp().getExpiryyearele(), 12);
		sendkeys(obj.getBookhotalp().getCvvnumele(), "123");
		elementclick(obj.getBookhotalp().getBooknowbutton());
		
	}
	@Given("Click on bozoked itinerary button")
	public void click_on_bozoked_itinerary_button() {
		implicitwait(10);
		ordernum = obj.getBooking_Confirmationpage().getOrderno().getAttribute("value");
		elementclick(obj.getBooking_Confirmationpage().getMyitinebutton());
	}
	@Given("Enter the orzder id")
	public void enter_the_orzder_id() {
		implicitwait(10);
	}
	@Given("Verify that tzhe relevant details are displayed")
	public void verify_that_tzhe_relevant_details_are_displayed() throws InterruptedException {
	    sendkeys(obj.getBooked_Itenerarypage().getOrderidenterfield(),ordernum);
	    elementclick(obj.getBooked_Itenerarypage().getGobutton());
		implicitwait(10);
		String text = obj.getBooked_Itenerarypage().getNameinbookeditenarele().getAttribute("value");		
	    Assert.assertEquals(ordernum, text);
	    
	}

	
	//=============================@TC-118====================================================	

	@Given("Login to the application usiing username and password as in test data.")
	public void login_to_the_application_usiing_username_and_password_as_in_test_data() throws InterruptedException {
		implicitwait(10);
		elementclick(obj.getAdactpage().getLocationele());
		dropdown(obj.getAdactpage().getLocationele(), 1);
		dropdown(obj.getAdactpage().getHotelsele(), 1);
		elementclick(obj.getAdactpage().getRoomtypeele());
		dropdown(obj.getAdactpage().getRoomtypeele(), 1);
		elementclick(obj.getAdactpage().getRoomtypeele());
		dropdown(obj.getAdactpage().getNoofroomsele(), 2);
		elementclear(obj.getAdactpage().getDatepickinele());
		sendkeys(obj.getAdactpage().getDatepickinele(), "27/07/2023");
		elementclear(obj.getAdactpage().getDatepickoutele());
		sendkeys(obj.getAdactpage().getDatepickoutele(), "28/07/2023");
		elementclick(obj.getAdactpage().getAdultroomele());
		dropdown(obj.getAdactpage().getAdultroomele(), 1);
		elementclick(obj.getAdactpage().getChildroomele());
		dropdown(obj.getAdactpage().getChildroomele(), 0);
		elementclick(obj.getAdactpage().getSearch());
		implicitwait(10);
		elementclick(obj.getSelecthotalp().getRadiobuttonele());
		elementclick(obj.getSelecthotalp().getSearchele());
		
	}
	@Given("Book an order as in previous test casses")
	public void book_an_order_as_in_previous_test_casses() throws InterruptedException {
		implicitwait(10);	
		sendkeys(obj.getBookhotalp().getNameele(), "Anand");
		sendkeys(obj.getBookhotalp().getLastnameele(), "M");
		sendkeys(obj.getBookhotalp().getAddressele(), "7/123,Abirami nagar");
		sendkeys(obj.getBookhotalp().getCreditcardnumele(), "1234567891234567");
		dropdown(obj.getBookhotalp().getCreditcarttypeele(), 4);
		dropdown(obj.getBookhotalp().getExpirymonthele(), 12);
		dropdown(obj.getBookhotalp().getExpiryyearele(), 12);
		sendkeys(obj.getBookhotalp().getCvvnumele(), "123");
		elementclick(obj.getBookhotalp().getBooknowbutton());
	}
	
	public static String hotaln;
	public static String locationn;
	public static String arrivaldatee;
	public static String departuree;
	
	@Given("Click on booked ittinerary button")
	public void click_on_booked_ittinerary_button() {
		implicitwait(10);
		ordernum = obj.getBooking_Confirmationpage().getOrderno().getAttribute("value");
		
		 hotaln = obj.getBooking_Confirmationpage().getBookconfirmhotalele().getAttribute("value");
		 locationn = obj.getBooking_Confirmationpage().getBookconfirmlocationele().getAttribute("value");
		 arrivaldatee = obj.getBooking_Confirmationpage().getBookconfirmarrivaldateele().getAttribute("value");
		 departuree = obj.getBooking_Confirmationpage().getBookconfirmdapartureele().getAttribute("value");
		
		
		elementclick(obj.getBooking_Confirmationpage().getMyitinebutton());
		

	}
	@Given("Search for Order number")
	public void search_for_order_number() {
		 sendkeys(obj.getBooked_Itenerarypage().getOrderidenterfield(),ordernum);
		    elementclick(obj.getBooked_Itenerarypage().getGobutton());
			implicitwait(10);
	}
	@Given("Verify all the details of order number are correct as entered during saving order")
	public void verify_all_the_details_of_order_number_are_correct_as_entered_during_saving_order() {
			String hotalnn = obj.getBooked_Itenerarypage().getBookitenarhotalnameele().getAttribute("value");
			String locationnn = obj.getBooked_Itenerarypage().getBookitenarlocationele().getAttribute("value");
			String arrivaldateee = obj.getBooked_Itenerarypage().getBookitenararrivalele().getAttribute("value");
			String departureee = obj.getBooked_Itenerarypage().getBookitenardepartureele().getAttribute("value");
			
			Assert.assertEquals(hotaln, hotalnn);
			Assert.assertEquals(locationn, locationnn);
			Assert.assertEquals(arrivaldatee, arrivaldateee);
			Assert.assertEquals(departuree, departureee);			
	}
	
	
	
	

	//=============================@TC-119====================================================	

	
	@Given("Login to the application usiing username and passsword as in test data.")
	public void login_to_the_application_usiing_username_and_passsword_as_in_test_data() throws InterruptedException {
		implicitwait(10);
		elementclick(obj.getAdactpage().getLocationele());
		dropdown(obj.getAdactpage().getLocationele(), 1);
		dropdown(obj.getAdactpage().getHotelsele(), 1);
		elementclick(obj.getAdactpage().getRoomtypeele());
		dropdown(obj.getAdactpage().getRoomtypeele(), 1);
		elementclick(obj.getAdactpage().getRoomtypeele());
		dropdown(obj.getAdactpage().getNoofroomsele(), 2);
		elementclear(obj.getAdactpage().getDatepickinele());
		sendkeys(obj.getAdactpage().getDatepickinele(), "27/07/2023");
		elementclear(obj.getAdactpage().getDatepickoutele());
		sendkeys(obj.getAdactpage().getDatepickoutele(), "28/07/2023");
		elementclick(obj.getAdactpage().getAdultroomele());
		dropdown(obj.getAdactpage().getAdultroomele(), 1);
		elementclick(obj.getAdactpage().getChildroomele());
		dropdown(obj.getAdactpage().getChildroomele(), 0);
		elementclick(obj.getAdactpage().getSearch());
		implicitwait(10);
		elementclick(obj.getSelecthotalp().getRadiobuttonele());
		elementclick(obj.getSelecthotalp().getSearchele());
	}
	@Given("Book the Hotel as in previous test cases. Keep a note of order number generated")
	public void book_the_hotel_as_in_previous_test_cases_keep_a_note_of_order_number_generated() throws InterruptedException {
		implicitwait(10);	
		sendkeys(obj.getBookhotalp().getNameele(), "Anand");
		sendkeys(obj.getBookhotalp().getLastnameele(), "M");
		sendkeys(obj.getBookhotalp().getAddressele(), "7/123,Abirami nagar");
		sendkeys(obj.getBookhotalp().getCreditcardnumele(), "1234567891234567");
		dropdown(obj.getBookhotalp().getCreditcarttypeele(), 4);
		dropdown(obj.getBookhotalp().getExpirymonthele(), 12);
		dropdown(obj.getBookhotalp().getExpiryyearele(), 12);
		sendkeys(obj.getBookhotalp().getCvvnumele(), "123");
		elementclick(obj.getBookhotalp().getBooknowbutton());
	}
	@Given("Click on Booked Itinerary")
	public void click_on_booked_itinerary() {
		implicitwait(10);
		ordernum = obj.getBooking_Confirmationpage().getOrderno().getAttribute("value");
		elementclick(obj.getBooking_Confirmationpage().getMyitinebutton());
	}
	@Given("Search for order number booked")
	public void search_for_order_number_booked() {
		 sendkeys(obj.getBooked_Itenerarypage().getOrderidenterfield(),ordernum);
		    elementclick(obj.getBooked_Itenerarypage().getGobutton());
			implicitwait(10);
	}
	@Given("Click on Cancel Order Number")
	public void click_on_cancel_order_number() {
	   elementclick(obj.getBooked_Itenerarypage().getClickradiobuttonele());
	   elementclick(obj.getBooked_Itenerarypage().getClickcancelbuttonele());
	}
	@Given("Click Yes on pop-up which asks where to cancel order or not")
	public void click_yes_on_pop_up_which_asks_where_to_cancel_order_or_not() {
	   driver.switchTo().alert().accept();
	}
	@Given("Verify that order number is cancelled and now longer exists in Booked Itinerary page")
	public void verify_that_order_number_is_cancelled_and_now_longer_exists_in_booked_itinerary_page() throws InterruptedException {
		String text = obj.getBooked_Itenerarypage().getSearchresulterrorele().getText();
		if(text==null) {
			System.out.println();
		}
		if(text=="\r\n"
				+ "					1 result(s) found. ") {
			Assert.fail();
		}
	
	}

	//=============================@TC-120====================================================	

	@Given("Verify that title of each page is the same as the page objective")
	public void verify_that_title_of_each_page_is_the_same_as_the_page_objective() {
		implicitwait(10);
		isdisplay(obj.getAdactpage().getWelcomemessage());
	}
	@Given("Click on Search hotel option and verify whether application directs to search hotel form")
	public void click_on_search_hotel_option_and_verify_whether_application_directs_to_search_hotel_form() {
	   elementclick(obj.getAdactpage().getSearchhotallinkele());
	   isdisplay(obj.getAdactpage().getSearchhotaldisele());
	}
	@Given("Click on booked itinerary button and verify that application directs to booked itinerary form")
	public void click_on_booked_itinerary_button_and_verify_that_application_directs_to_booked_itinerary_form() {
		elementclick(obj.getAdactpage().getBookitineraryele());
		implicitwait(10);
		isdisplay(obj.getBooked_Itenerarypage().getBookitinerarylogoele());
	}
	
















}


