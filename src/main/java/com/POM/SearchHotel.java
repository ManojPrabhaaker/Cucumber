package com.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotel {
	public static WebDriver driver;

	@FindBy(xpath = "(//select[@id='location'])[1]")
	private WebElement Location;

	@FindBy(xpath = "(//select[@id='hotels'])[1]")
	private WebElement HotelSearch;

	@FindBy(xpath = "//select[@name='room_type']")
	private WebElement Roomtype;

	@FindBy(xpath = "//select[@name='room_nos']")
	private WebElement Roomnos;

	@FindBy(xpath = "(//input[@type='text'])[2]")
	private WebElement Indate;

	@FindBy(xpath = "(//input[@type='text'])[3]")
	private WebElement Outdate;

	@FindBy(xpath = "(//select[@name='adult_room'])")
	private WebElement Adultroom;

	@FindBy(xpath = "(//select[@name='child_room'])")
	private WebElement Chidroom;

	@FindBy(id = "Submit")
	private WebElement Search;

	public SearchHotel(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public WebElement getLocation() {
		return Location;
	}

	public WebElement getHotelSearch() {
		return HotelSearch;
	}

	public WebElement getRoomtype() {
		return Roomtype;
	}

	public WebElement getRoomnos() {
		return Roomnos;
	}

	public WebElement getIndate() {
		return Indate;
	}

	public WebElement getOutdate() {
		return Outdate;
	}

	public WebElement getAdultroom() {
		return Adultroom;
	}

	public WebElement getChidroom() {
		return Chidroom;
	}

	public WebElement getSearch() {
		return Search;
	}
}
