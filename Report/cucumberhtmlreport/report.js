$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/com/adactin/feature/Adactin.feature");
formatter.feature({
  "line": 1,
  "name": "Hotel Booking In Adactin Application",
  "description": "",
  "id": "hotel-booking-in-adactin-application",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Login Functionality",
  "description": "",
  "id": "hotel-booking-in-adactin-application;login-functionality",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 2,
      "name": "@First"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "user Launches The Application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user Enters Valid Username",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user Enters Valid  Password",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user Clicks on Login Button And It Navigates To Homepage",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_Launches_The_Application()"
});
formatter.result({
  "duration": 2371964600,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Enters_Valid_Username()"
});
formatter.result({
  "duration": 136834700,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Enters_Valid_Password()"
});
formatter.result({
  "duration": 66545001,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Clicks_on_Login_Button_And_It_Navigates_To_Homepage()"
});
formatter.result({
  "duration": 692414400,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "Search Hotels Availability",
  "description": "",
  "id": "hotel-booking-in-adactin-application;search-hotels-availability",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 10,
      "name": "@Second"
    }
  ]
});
formatter.step({
  "line": 12,
  "name": "user Select Location of Hotel",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "user Select The Hotel Name",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "user Select Type Of Room",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "user Select No Of Room",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "user Select The Check In Date",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "user Select The Check Out Date",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "user Select Adults Per Room Details",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "user Select Children Per Room Details",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "user Clicks On Search Button And It Navigates Search Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_Select_Location_of_Hotel()"
});
formatter.result({
  "duration": 239152900,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Select_The_Hotel_Name()"
});
formatter.result({
  "duration": 138307200,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Select_Type_Of_Room()"
});
formatter.result({
  "duration": 137255801,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Select_No_Of_Room()"
});
formatter.result({
  "duration": 218420099,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Select_The_Check_In_Date()"
});
formatter.result({
  "duration": 119307300,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Select_The_Check_Out_Date()"
});
formatter.result({
  "duration": 156826299,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Select_Adults_Per_Room_Details()"
});
formatter.result({
  "duration": 145455400,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Select_Children_Per_Room_Details()"
});
formatter.result({
  "duration": 123192199,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Clicks_On_Search_Button_And_It_Navigates_Search_Hotel_Page()"
});
formatter.result({
  "duration": 504217700,
  "status": "passed"
});
formatter.scenario({
  "line": 23,
  "name": "Select The Hotel",
  "description": "",
  "id": "hotel-booking-in-adactin-application;select-the-hotel",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 22,
      "name": "@Third"
    }
  ]
});
formatter.step({
  "line": 24,
  "name": "user Select The Hotel Via Radio Button",
  "keyword": "When "
});
formatter.step({
  "line": 25,
  "name": "user Click The Continue Button And Navigate To Book A Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_Select_The_Hotel_Via_Radio_Button()"
});
formatter.result({
  "duration": 62449999,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Click_The_Continue_Button_And_Navigate_To_Book_A_Hotel_Page()"
});
formatter.result({
  "duration": 508684600,
  "status": "passed"
});
formatter.scenario({
  "line": 28,
  "name": "Book A Hotel",
  "description": "",
  "id": "hotel-booking-in-adactin-application;book-a-hotel",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 27,
      "name": "@Fourth"
    }
  ]
});
formatter.step({
  "line": 29,
  "name": "user Enter The First Name In First Name Field",
  "keyword": "When "
});
formatter.step({
  "line": 30,
  "name": "user Enter The Last Name In Last Name Field",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "user Enter THe Billing Address in Billing Address Field",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "user Enter The 16 Digit Credit Card Number In Credit Card Field",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "user Select Credit Card Type In Credit Card Type Field",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "user Select Expiry Month And Year In Expiry Date Field",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "user Enter CVV Number In CVV Field",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "Click The Book Now Button And It Navigates TO Booking Confirmation Page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_Enter_The_First_Name_In_First_Name_Field()"
});
formatter.result({
  "duration": 80836401,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Enter_The_Last_Name_In_Last_Name_Field()"
});
formatter.result({
  "duration": 66700499,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Enter_THe_Billing_Address_in_Billing_Address_Field()"
});
formatter.result({
  "duration": 100187700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "16",
      "offset": 15
    }
  ],
  "location": "StepDefinition.user_Enter_The_Digit_Credit_Card_Number_In_Credit_Card_Field(int)"
});
formatter.result({
  "duration": 76161300,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Select_Credit_Card_Type_In_Credit_Card_Type_Field()"
});
formatter.result({
  "duration": 185660201,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Select_Expiry_Month_And_Year_In_Expiry_Date_Field()"
});
formatter.result({
  "duration": 246279900,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Enter_CVV_Number_In_CVV_Field()"
});
formatter.result({
  "duration": 69514999,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.click_The_Book_Now_Button_And_It_Navigates_TO_Booking_Confirmation_Page()"
});
formatter.result({
  "duration": 61941400,
  "status": "passed"
});
});