package com.adactin.Runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src//test//java//com//adactin//feature",
glue = "com.adactin.Stepdefinition",
monochrome = true,
dryRun =false,
strict= true ,
tags =("@smoketest,@sanitytest"),
plugin = {"html:Reports/Html.Report",
		"pretty",
		"json:Reports/JsonReport.json",
		"com.cucumber.listener.ExtentCucumberFormatter:Reports/ExtentReport.html"
}
)

public class RunnerClass {

	public static WebDriver driver;

	@BeforeClass
	public static void Setup() {
		System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@AfterClass
	public static void tearDown() {
		driver.close();
	}

}
