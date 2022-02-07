package com.pom.com;


import org.openqa.selenium.WebDriver;

public class PageObjectManager {
	public WebDriver driver;
	private DropDown dr;
	private Login lo;
	private RadioButton ra;
	
	public PageObjectManager(WebDriver driver2) {
		this.driver=driver2;
	}
	public DropDown getDropDown() {
		DropDown dr=new DropDown(driver);
		return dr;
		
	}
	public Login getLogin() {
		Login lo= new Login(driver);
		return lo;
	}
	public RadioButton getRadioButton() {
		RadioButton ra = new RadioButton(driver);
		return ra;
	}

}
