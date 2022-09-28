package com.Runnerclass;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Runnerclass {
	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver",
				"\\Users\\Manoj\\eclipse-workspace\\adactinCucumber\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com");
		driver.manage().window().maximize();

		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("Manoj1994");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("12345678");
		WebElement login = driver.findElement(By.id("login"));
		login.click();

		Thread.sleep(2000);

		WebElement location = driver.findElement(By.xpath("(//select[@id='location'])[1]"));
		Select s = new Select(location);
		s.selectByValue("London");

		WebElement hotel = driver.findElement(By.xpath("(//select[@id='hotels'])[1]"));
		Select s1 = new Select(hotel);
		s1.selectByVisibleText("Hotel Sunshine");

		WebElement rooms = driver.findElement(By.xpath("//select[@name='room_type']"));
		Select s2 = new Select(rooms);
		s2.selectByVisibleText("Super Deluxe");

		WebElement roomnos = driver.findElement(By.xpath("//select[@name='room_nos']"));
		Select s3 = new Select(roomnos);
		s3.selectByIndex(4);

		WebElement indate = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		indate.clear();
		indate.sendKeys("05/08/2022");

		WebElement outdate = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
		outdate.clear();
		outdate.sendKeys("10/08/2022");

		WebElement adultroom = driver.findElement(By.xpath("(//select[@name='adult_room'])"));
		Select s4 = new Select(adultroom);
		s4.selectByIndex(3);

		WebElement childroom = driver.findElement(By.xpath("(//select[@name='child_room'])"));
		Select s5 = new Select(childroom);
		s5.selectByIndex(3);

		// WebElement search = driver.findElement(By.id("//input[@name='Submit']"));
		// search.click();

		driver.findElement(By.id("Submit")).click();

		WebElement click_btn = driver.findElement(By.id("radiobutton_0"));
		click_btn.click();

		WebElement con_btn = driver.findElement(By.id("continue"));
		con_btn.click();

		WebElement firstname = driver.findElement(By.id("first_name"));
		firstname.sendKeys("Virat");

		WebElement lastname = driver.findElement(By.id("last_name"));
		lastname.sendKeys("Kohli");

		WebElement address = driver.findElement(By.id("address"));
		address.sendKeys("Maldives");

		WebElement cardnumber = driver.findElement(By.id("cc_num"));
		cardnumber.sendKeys("1234567891011121");

		WebElement cc = driver.findElement(By.id("cc_type"));
		Select s6 = new Select(cc);
		s6.selectByIndex(3);

		WebElement cc_month = driver.findElement(By.id("cc_exp_month"));
		Select s7 = new Select(cc_month);
		s7.selectByIndex(3);

		WebElement cc_year = driver.findElement(By.id("cc_exp_year"));
		Select s8 = new Select(cc_year);
		s8.selectByIndex(2);

		WebElement cvv = driver.findElement(By.id("cc_cvv"));
		cvv.sendKeys("7620");

		WebElement click_nowbtn = driver.findElement(By.id("book_now"));
		click_nowbtn.click();

		WebElement logout1 = driver.findElement(By.xpath("//a[@href=\"Logout.php\"]"));
		logout1.click();

	}
}
