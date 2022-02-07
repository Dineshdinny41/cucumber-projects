package com.adactin.runner;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.baseclass.com.BaseClassCucumber;
import com.filereader.com.FileReaderManager;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\java\\com\\adactin\\feature\\Adactin.feature",glue="com.adactin.stepdefinition",
monochrome=true,dryRun=false,tags= ("@First,@Second,@Third,@Fourth"),
plugin= {"html:Report/cucumberhtmlreport","pretty","json:Report/cucumber.json",
		"com.cucumber.listener.ExtentCucumberFormatter:CucumberExtent/cukesExtentReport.html"
		}

		
		)
public class Runner {
public static WebDriver driver;
@BeforeClass
public static void set_Up() throws IOException {
	String browser= FileReaderManager.getInstanceFRM().getInstanceCR().getbrowser();
	driver= BaseClassCucumber.launchbrowser("chrome");
	
}
@AfterClass
public static void tear_Down() {
	driver.close();
}
}
