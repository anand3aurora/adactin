Feature: adactin login

  Background: 
    Given Launch hotel reservation application using URL as in test data."https://adactinhotelapp.com/index.php"
    And Login to the application using username "anand3aurora" and password "anand3aurora" as in test data.

  #@TC-101
  #Scenario: adactin login with valid detais
  #Given Launch hotel test data."https://adactinhotelapp.com/index.php"
  #And Login username "anand3aurora" password "anand3aurora" as test data.
  @TC-102
  Scenario: To verify whether the check-out date field accepts a later date than check-in date.
    Given Select location as in test data.
    And Select hotel as in test data.
    And Select room type as in test data.
    And Select no-ofrooms as in test data.
    And Enter check-indate later than the check-outdate field as in test data.

  @TC-103
  Scenario: To check if error is date field is in the past
    And Select location as in test data.
    And Select hotel as in test data.
    And Select room type as in test data.
    And Select no-ofrooms as in test data.
    And Enter checkout-date as in test data. Verify that application throws error message

  @TC-104
  Scenario: To verifycwhether locations in Select Hotel page are displayed according to the location selected in Search Hotel
    Given Select location as in test
    And Select hotel as in test
    And Select room type as in test
    And Select noof-rooms as in test
    And Enter checkout-date as in test
    And Select Noof-adults as in test
    And Select No-ofchildren as in test
    And Click on Search Button
    And Verify that hotel displayed is the same as selected in search Hotel form.

  @TC-105
  Scenario: To verify date and Check Out date are being displayed in Select Hotel Page according to the dates selected in search Hotel.
    Given location as in testt
    And Select hotel as in testt
    And Select room type as in testt
    And Select noof-rooms as in testt
    And Enter checkout-date as in testt
    And Select Noof-adults as in testt
    And Select No-ofchildren as in testt
    And Click on Searchh Button
    And Verify that check-in-date and check-outdates are the same as selected in search hotel form.

  @TC-106
  Scenario: To verify whether no. of rooms entry in Select Hotel page is same as the Number of rooms selected in search hotel page
    Given location as in teest
    And Select hotel as in teest
    And Select room type as in teest
    And Select noof-rooms as in teest
    And Enter checkout-date as in teest
    And Select Noof-adults as in teest
    And Select No-ofchildren as in teest
    And Click on Searcch Button
    And Verify that no. of rooms reflected according to the no. of rooms selected in search hotel page

  @TC-107
  Scenario: To verify whether Room Type in Select Hotel page is same as Room type selected in search hotel page
    Given location as in tesst
    And Select hotel as in tesst
    And Select room type as in tesst
    And Select noof-rooms as in tesst
    And Enter checkout-date as in tesst
    And Select Noof-adults as in tesst
    And Select No-ofchildren as in tesst
    And Click on Searrch Button
    And Verify that room type reflected is the same as selected in search hotel page.

  @TC-108
  Scenario: To verify whether the total price (excl.GST) is calculate d as “price per night * no. of nights* no of rooms”.
    Given Select location as in test datas.
    And Select hotel as in a test datas
    And Select roomtype as in test data
    And Select no of rooms as in test data
    And Enter check out date as in test data
    And Select no of adults as in test data
    And Select no. of children as in test data
    And Click on search butto
    And Select the hotel and click continue button
    And Verify the total price(excl GST) is being calculated as (price-pernight*no-ofrooms*no-ofdays)

  @TC-109
  Scenario: To verify when pressed, logout button logs out from the application.
    Given Select location as in test data
    And Select hotel as in test data
    And Select room type as in test data
    And Select no-ofrooms as in test data
    And Enter checkout-date as in test data
    And Select No-ofadults as in test data
    And Select No-ofchildren as in test data
    And Click on Search the Button.
    And Select the hotel and click on continue button
    And Enter he details and click on book now
    And Check the details,click on logout and verify if we have logged out from the ap

  @TC-110
  Scenario: To check correct total price is Being Calculate d as “price pernight*no of days*no of rooms in Book a hotel Page
    Given Select location a in test data
    And Select hotel a in test data
    And Select room type a in test data
    And Select no-ofrooms a in test data
    And Enter checkout-date a in test data
    And Select No-ofadults a in test data
    And Select No-ofchildren a in test data
    And Click o Search the Button.
    And Select the hotel and click o continue button
    And Verify that total-price is being calculated as price-pernight

  @TC-111
  Scenario: To check Hotel name, Location, room type, Total Day, price per
    Given Select locationn a in test data
    And Select hotell a in test data
    And Select room typee a in test data
    And Select no-ofroomms a in test data
    And Enter checkout-datte a in test data
    And Select No-ofadultss a in test data
    And Select No-ofchildrenn a in test data
    And Click o Searcch the Button.
    And Select the hotel and clicck o continue button
    And Verify that total-price is being calculatted as price-pernight*no-ofrooms*no-ofdays

  @TC-112
  Scenario: To check correct Final billed price is Total Price + 10% Total price in Book a Hotel page
    Given Select loca.tion a in test data
    And Select hotel a i. test data
    And Select room. typ a in test data
    And Select no-ofroo.ms a in test data
    And Enter chec.kout-date a in test data
    And Select No-ofadult. a in test data
    And Select No-of.children a in test data
    And Click o Search. th Button.
    And Select the. hotel and click o continu button
    And Verify that total-price is. being calculated

  @TC-113
  Scenario: To verify whether the data displayed is same as the selected data in Book hotel page
    Given Select loca.tion a in tesft data
    And Select hotel a i. tesft data
    And Select room. typ a in tesft data
    And Select no-ofroo.ms a in tesft data
    And Enter chec.kout-date a in tesft data
    And Select No-ofadult. a in tesft data
    And Select No-of.children a in tesft data
    And Click o Search. thr Button.
    And Select the. hotel and click o continuf button
    And Verify that total-price is being calculated as pprice-pernight*no-ofrooms*no-ofdays

  @TC-114
  Scenario: Verify Order number is generate d in booking confirmati on page
    Given Select loca.tion a in tesgt data
    And Select hotel a i. tesgt data
    And Select room. typ a in tesgt data
    And Select no-ofroo.ms a in tesgt data
    And Enter chec.kout-date a in tesgt data
    And Select No-ofadult. a in tesgt data
    And Select No-of.children a in tesgt data
    And Click o Search. thg Button.
    And Select the. hotel and click o continug button
    And Verify that total-price is being calculated as gprice-pernight*no-ofrooms*no-ofdays
    And Verify Order number is generate d in booking confirmation page

  @TC-115
  Scenario: Verify whether the booked itinerary details are not editable.
    Given Select locaation a in tesgt data
    And Select hotels in tesgt data
    And Select roomy typ a in tesgt data
    And Select no-ofyroo.ms a in tesgt data
    And Enter chec.yout-date a in tesgt data
    And Select No-ofyadult. a in tesgt data
    And Select No-of.chyildren a in tesgt data
    And Click o Searchy. thg Button.
    And Select the. hotely and click o continug button
    And Fill the form and click on Book now button
    And Click on My itinerary button
    And Verify that the details are not editable

  @TC-116
  Scenario: To check whether the booked itinerary reflects the correct informatio n in line with the booking
    Given Select locaatiion a in tesgt data
    And Select hotels in tesgt dataa
    And Select roomy typ a in tesgt daata
    And Select no-ofyroo.ms a in tesgt daata
    And Enter chec.yout-date a in tesgt daata
    And Select No-ofyadult. a in tesgt daata
    And Select No-of.chyildren a in tesgt daata
    And Click o Searchy. thg Buttton.
    And Select the. hotely and clicck o continug button
    And Fill the form and click on Boook now button
    And Click on My itinerary buttton
    And Verify that the details are rreflected correctly as per the booking

  @TC-117
  Scenario: To check whether search order id” query is working and displaying the relevant details
    Given Login to tzhe application using username and password as in test data.
    And Click on bozoked itinerary button
    And Enter the orzder id
    And Verify that tzhe relevant details are displayed

  @TC-118
  Scenario: Verify all the details of newly generated order number in booked itinerary page are correct and match with data during booking
    Given Login to the application usiing username and password as in test data.
    And Book an order as in previous test casses
    And Click on booked ittinerary button
    And Search for Order number
    And Verify all the details of order number are correct as entered during saving order

  @TC-119
  Scenario: To verify that the order gets cancelled after click on Cancel order number link
    Given Login to the application usiing username and passsword as in test data.
    And Book the Hotel as in previous test cases. Keep a note of order number generated
    And Click on Booked Itinerary
    And Search for order number booked
    And Click on Cancel Order Number
    And Click Yes on pop-up which asks where to cancel order or not
    And Verify that order number is cancelled and now longer exists in Booked Itinerary page

  @TC-120
  Scenario: To verify Title of every Page reflects what the page objective is. For example Title of Search Hotel page should have “Search Hotel”
    Given Verify that title of each page is the same as the page objective
    And Click on Search hotel option and verify whether application directs to search hotel form
    And Click on booked itinerary button and verify that application directs to booked itinerary form
