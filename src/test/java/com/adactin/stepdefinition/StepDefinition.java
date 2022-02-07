package com.adactin.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.adactin.runner.Runner;
import com.baseclass.com.BaseClassCucumber;

import com.filereader.com.FileReaderManager;
import com.pom.com.PageObjectManager;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition extends BaseClassCucumber {
	public static WebDriver driver=Runner.driver;
	public static PageObjectManager pom= new PageObjectManager(driver);
	@Given("^user Launches The Application$")
	public void user_Launches_The_Application() throws Throwable {
		geturl("https://adactinhotelapp.com/");
	}

	@When("^user Enters Valid Username$")
	public void user_Enters_Valid_Username() throws Throwable {
		signup1(pom.getLogin().getB(), "mail", FileReaderManager.getInstanceFRM().getInstanceCR().getusername());
	}

	@When("^user Enters Valid  Password$")
	public void user_Enters_Valid_Password() throws Throwable {
		signup1(pom.getLogin().getC(), "password", FileReaderManager.getInstanceFRM().getInstanceCR().getpassword());
	}

	@Then("^user Clicks on Login Button And It Navigates To Homepage$")
	public void user_Clicks_on_Login_Button_And_It_Navigates_To_Homepage() throws Throwable {
		click(pom.getLogin().getD());
	}
	@When("^user Select Location of Hotel$")
	public void user_Select_Location_of_Hotel() throws Throwable {
		dropdown(pom.getDropDown().getA1(), "index", "5");
	}

	@When("^user Select The Hotel Name$")
	public void user_Select_The_Hotel_Name() throws Throwable {
		dropdown(pom.getDropDown().getB1(), "value", "Hotel Hervey");
	}

	@When("^user Select Type Of Room$")
	public void user_Select_Type_Of_Room() throws Throwable {
		dropdown(pom.getDropDown().getC1(), "text", "Double");
	}
	@When("^user Select No Of Room$")
	public void user_Select_No_Of_Room() throws Throwable {
		dropdown(pom.getDropDown().getD1(), "index", "6");
	}


	@When("^user Select The Check In Date$")
	public void user_Select_The_Check_In_Date() throws Throwable {
		datesender(pom.getDropDown().getE1(), "25/01/2022", "one");	
			}

	@When("^user Select The Check Out Date$")
	public void user_Select_The_Check_Out_Date() throws Throwable {
		datesender(pom.getDropDown().getF1(), "27/01/2022", "two");
	}

	@When("^user Select Adults Per Room Details$")
	public void user_Select_Adults_Per_Room_Details() throws Throwable {
		drop(pom.getDropDown().getG1(), "index", "2");
	}

	@When("^user Select Children Per Room Details$")
	public void user_Select_Children_Per_Room_Details() throws Throwable {
		dropdown(pom.getDropDown().getH1(), "value", "2");
	}

	@Then("^user Clicks On Search Button And It Navigates Search Hotel Page$")
	public void user_Clicks_On_Search_Button_And_It_Navigates_Search_Hotel_Page() throws Throwable {
		 searchclick(pom.getDropDown().getI1());
	}

	@When("^user Select The Hotel Via Radio Button$")
	public void user_Select_The_Hotel_Via_Radio_Button() throws Throwable {
		 radd(pom.getRadioButton().getA2(), "radio");
	}

	@Then("^user Click The Continue Button And Navigate To Book A Hotel Page$")
	public void user_Click_The_Continue_Button_And_Navigate_To_Book_A_Hotel_Page() throws Throwable {
		  radd(pom.getRadioButton().getB2(), "click");
	}
	@When("^user Enter The First Name In First Name Field$")
	public void user_Enter_The_First_Name_In_First_Name_Field() throws Throwable {
		 fillupss(pom.getRadioButton().getC2(), "Dinesh", "firstname");
	}

	@When("^user Enter The Last Name In Last Name Field$")
	public void user_Enter_The_Last_Name_In_Last_Name_Field() throws Throwable {
		 fillupss(pom.getRadioButton().getD2(), "manoharan", "lastname");
	}

	@When("^user Enter THe Billing Address in Billing Address Field$")
	public void user_Enter_THe_Billing_Address_in_Billing_Address_Field() throws Throwable {
		 fillupss(pom.getRadioButton().getE2(), "no:88/4 west mada street,chennai- 122", "billingaddreess");
	}

	@When("^user Enter The (\\d+) Digit Credit Card Number In Credit Card Field$")
	public void user_Enter_The_Digit_Credit_Card_Number_In_Credit_Card_Field(int arg1) throws Throwable {
		 fillupss(pom.getRadioButton().getF2(), "0123456789012345", "creditcard");
	}

	@When("^user Select Credit Card Type In Credit Card Type Field$")
	public void user_Select_Credit_Card_Type_In_Credit_Card_Type_Field() throws Throwable {
		drop1(pom.getRadioButton().getG2(), "index", "3");
	}

	@When("^user Select Expiry Month And Year In Expiry Date Field$")
	public void user_Select_Expiry_Month_And_Year_In_Expiry_Date_Field() throws Throwable {
		 drop1(pom.getRadioButton().getH2(), "value", "4");
		 drop1(pom.getRadioButton().getI2(), "text", "2022");
	}

	@When("^user Enter CVV Number In CVV Field$")
	public void user_Enter_CVV_Number_In_CVV_Field() throws Throwable {
		 fillupss(pom.getRadioButton().getJ2(), "678", "cvv");
	}

	@Then("^Click The Book Now Button And It Navigates TO Booking Confirmation Page$")
	public void click_The_Book_Now_Button_And_It_Navigates_TO_Booking_Confirmation_Page() throws Throwable {
		 radd(pom.getRadioButton().getK2(), "booknow");
	}


}