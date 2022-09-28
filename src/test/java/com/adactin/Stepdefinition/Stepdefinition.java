package com.adactin.Stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.BaseClass.BaseClass;
import com.POM.LoginPage;
import com.POM.SearchHotel;
import com.adactin.Runner.RunnerClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdefinition extends BaseClass {

	WebDriver driver = RunnerClass.driver;
	LoginPage LP = new LoginPage(driver);
	SearchHotel SH = new SearchHotel(driver);

	@Given("^user launch The Adactin Application$")
	public void user_launch_The_Adactin_Application() throws Throwable {
		driver.get("https://adactinhotelapp.com");
	}

	@When("^user Enter The User In Username Feild$")
	public void user_Enter_The_User_In_Username_Feild() throws Throwable {
	//	WebElement username = driver.findElement(By.id("username"));
	//	username.sendKeys("Manoj1994");
		User_Input(LP.getUsername(),"Manoj1994" );
	}

	@When("^user Enter The Password In Password Feild$")
	public void user_Enter_The_Password_In_Password_Feild() throws Throwable {
	//	WebElement password = driver.findElement(By.id("password"));
	//	password.sendKeys("12345678");
		User_Input(LP.getPassword(), "12345678");
	}

	@Then("^user Click The Login Button And It Navigates To Search Hotel Page$")
	public void user_Click_The_Login_Button_And_It_Navigates_To_Search_Hotel_Page() throws Throwable {
	//	WebElement login = driver.findElement(By.id("login"));
	//	login.click();
		User_Click(LP.getLogin());
	}

	@When("^user Select The Location In Adactin Application$")
	public void user_Select_The_Location_In_Adactin_Application() throws Throwable {
	//	WebElement location = driver.findElement(By.xpath("(//select[@id='location'])[1]"));
	//	Select s = new Select(location);
	//	s.selectByValue("London");
		DropDown_select(SH.getLocation(), "value", "London");
	}

	@When("^user Select The Hotel In Adactin Application$")
	public void user_Select_The_Hotel_In_Adactin_Application() throws Throwable {
	//	WebElement hotel = driver.findElement(By.xpath("(//select[@id='hotels'])[1]"));
	//	Select s1 = new Select(hotel);
	//	s1.selectByVisibleText("Hotel Sunshine");
		DropDown_select(SH.getHotelSearch(),"VisibleText", "Hotel Sunshine");
	}

	@When("^user Select The Room Type   In Adactin Application$")
	public void user_Select_The_Room_Type_In_Adactin_Application() throws Throwable {
	//	WebElement rooms = driver.findElement(By.xpath("//select[@name='room_type']"));
	//	Select s2 = new Select(rooms);
	//	s2.selectByVisibleText("Super Deluxe");
		DropDown_select(SH.getRoomtype(), "VisibleText","Super Deluxe");
	}

	@When("^user Select The Number of Rooms In Adactin Application$")
	public void user_Select_The_Number_of_Rooms_In_Adactin_Application() throws Throwable {
	//	WebElement roomnos = driver.findElement(By.xpath("//select[@name='room_nos']"));
	//	Select s3 = new Select(roomnos);
	//	s3.selectByIndex(4);
		DropDown_select(SH.getRoomnos(), "Index", "4");
	}

	@When("^user Select The Check  In Date In Adactin Application$")
	public void user_Select_The_Check_In_Date_In_Adactin_Application() throws Throwable {
	//	WebElement indate = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
	//	indate.clear();
	//	indate.sendKeys("05/08/2022");
		User_Clear(SH.getIndate());
		User_Input(SH.getIndate(), "05/08/2022");
	}

	@When("^user Select The Check Out Date In Adactin Application$")
	public void user_Select_The_Check_Out_Date_In_Adactin_Application() throws Throwable {
	//	WebElement outdate = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
	//	outdate.clear();
	//	outdate.sendKeys("10/08/2022");
		User_Clear(SH.getOutdate());
		User_Input(SH.getOutdate(), "10/08/2022");
	}

	@When("^user Select The Adults Per Room  In Adactin Application$")
	public void user_Select_The_Adults_Per_Room_In_Adactin_Application() throws Throwable {
	//	WebElement adultroom = driver.findElement(By.xpath("(//select[@name='adult_room'])"));
	//	Select s4 = new Select(adultroom);
	//	s4.selectByIndex(3);
		DropDown_select(adultroom, "Index","3");
	}

	@When("^user Select The Childrens Per Room  In Adactin Application$")
	public void user_Select_The_Childrens_Per_Room_In_Adactin_Application() throws Throwable {
	//	WebElement childroom = driver.findElement(By.xpath("(//select[@name='child_room'])"));
	//	Select s5 = new Select(childroom);
	//	s5.selectByIndex(3);
		DropDown_select(childroom, "childroom", "3");
		
	}

	@Then("^user Click The Search Button And It Navigates To Hotel Confirmation Page$")
	public void user_Click_The_Search_Button_And_It_Navigates_To_Hotel_Confirmation_Page() throws Throwable {
	//	driver.findElement(By.id("Submit")).click();
	}

	@When("^user Confirm The Hotel By Selecting The Select Button$")
	public void user_Confirm_The_Hotel_By_Selecting_The_Select_Button() throws Throwable {
		WebElement click_btn = driver.findElement(By.id("radiobutton_0"));
	//	click_btn.click();
		User_Click(click_btn);
	}

	@Then("^user Click The continue Button And It Navigates To Book A Hotel Page$")
	public void user_Click_The_continue_Button_And_It_Navigates_To_Book_A_Hotel_Page() throws Throwable {

		WebElement con_btn = driver.findElement(By.id("continue"));
	//	con_btn.click();
		User_Click(con_btn);
	}

	@When("^user Enter The First Name In The Feild$")
	public void user_Enter_The_First_Name_In_The_Feild() throws Throwable {
		WebElement firstname = driver.findElement(By.id("first_name"));
	//	firstname.sendKeys("Virat");
		User_Input(firstname, "Virat");
	}

	@When("^user Enter The Last Name In The Feild$")
	public void user_Enter_The_Last_Name_In_The_Feild() throws Throwable {

		WebElement lastname = driver.findElement(By.id("last_name"));
	//	lastname.sendKeys("Kohli");
		User_Input(lastname, "Kohli");
	}

	@When("^user Enter The Billing Address In The Feild$")
	public void user_Enter_The_Billing_Address_In_The_Feild() throws Throwable {

		WebElement address = driver.findElement(By.id("address"));
	//	address.sendKeys("Maldives");
		User_Input(address, "Maldives");
	}

	@When("^user Enter The Credit Card Number In The Feild$")
	public void user_Enter_The_Credit_Card_Number_In_The_Feild() throws Throwable {
		WebElement cardnumber = driver.findElement(By.id("cc_num"));
	//	cardnumber.sendKeys("1234567891011121");
		User_Input(cardnumber, "1234567891011121");
	}

	@When("^user Select The Credit Card Type  In The Application$")
	public void user_Select_The_Credit_Card_Type_In_The_Application() throws Throwable {
		WebElement cc = driver.findElement(By.id("cc_type"));
	//	Select s6 = new Select(cc);
	//	s6.selectByIndex(3);
		DropDown_select(cc, "Index","3");
	}
	
	@When("^user Select The Credit Card Expire Month In The Application$")
	public void user_Select_The_Credit_Card_Expire_Month_In_The_Application() throws Throwable {
		WebElement cc_month = driver.findElement(By.id("cc_exp_month"));
	//	Select s7 = new Select(cc_month);
	//	s7.selectByIndex(3);
		DropDown_select(cc_month, "Index","3");
	    	}

	@When("^user Select The Credit Card Expire Year In The Application$")
	public void user_Select_The_Credit_Card_Expire_Year_In_The_Application() throws Throwable {
		WebElement cc_year = driver.findElement(By.id("cc_exp_year"));
	//	Select s8 = new Select(cc_year);
	//	s8.selectByIndex(2);
		DropDown_select(cc_year, "Index","2");
	   
	}
	@When("^user Select The Credit Card Cvv Number  In The Application$")
	public void user_Select_The_Credit_Card_Cvv_Number_In_The_Application() throws Throwable {
		WebElement cvv = driver.findElement(By.id("cc_cvv"));
	//	cvv.sendKeys("7620");
		User_Input(cvv, "7620");
	}

	@Then("^user Click The Book Now  Button And It Navigates To Booking Confirmation Page$")
	public void user_Click_The_Book_Now_Button_And_It_Navigates_To_Booking_Confirmation_Page() throws Throwable {
		WebElement click_nowbtn = driver.findElement(By.id("book_now"));
	//	click_nowbtn.click();
		User_Click(click_nowbtn);
	}

	

	@Then("^user Click The Log Out Button In The Adactin Application and It Navigates To Home Page$")
	public void user_Click_The_Log_Out_Button_In_The_Adactin_Application_and_It_Navigates_To_Home_Page()
			throws Throwable {
		WebElement logout1 = driver.findElement(By.xpath("//a[@href=\"Logout.php\"]"));
	//	logout1.click();
		User_Click(logout1);
	}

}
