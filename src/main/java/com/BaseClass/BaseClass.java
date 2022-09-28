package com.BaseClass;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	public static WebDriver driver;
	public static String value;

	public static WebDriver Browser_Launch(String Option) {

		if (Option.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", ".\\driver\\Chromedriver.exe");
			driver = new ChromeDriver();
		} else if (Option.equalsIgnoreCase("Edge")) {
			System.setProperty("Webdriver.edge.driver", ".\\driver\\msedgedriver.exe");
			driver = new EdgeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}

	public static WebDriver Get_URL(String value) {
		driver.get(value);
		return driver;
	}

	public static void User_Click(WebElement element) {
		element.click();
	}

	public static void User_Input(WebElement element, String input) {
		element.sendKeys(input);
	}

	public static void User_Clear(WebElement element) {
		element.clear();
	}

	public static WebDriver User_Close(WebDriver driver) {
		driver.close();
		return driver;
	}

	public static WebDriver User_Quit() {
		driver.quit();
		return driver;
	}

	public static WebDriver Navigate_To(WebDriver driver, String value) {
		driver.navigate().to(value);
		return driver;
	}

	public static void Navigation_Commands(WebDriver driver, String option) {
		if (option.equalsIgnoreCase("Forward")) {
			driver.navigate().forward();
		} else if (option.equalsIgnoreCase("Back")) {
			driver.navigate().back();
		} else if (option.equalsIgnoreCase("refresh")) {
			driver.navigate().refresh();
		}
	}

	public static void Simple_Alert() {

		Alert alert = driver.switchTo().alert();
		alert.accept();
	}

	public static void Confirm_Alert(String option) {
		Alert alert = driver.switchTo().alert();
		if (option.equalsIgnoreCase("Accept")) {
			alert.accept();
		} else if (option.equalsIgnoreCase("Dismiss")) {
			alert.dismiss();
		}
	}

	public static void Prompt_Alert(String option, String Input) {
		Alert alert = driver.switchTo().alert();
		if (option.equalsIgnoreCase("Accept")) {
			alert.sendKeys(Input);
			alert.accept();
		} else if (option.equalsIgnoreCase("Dismiss")) {
			alert.dismiss();
		}

	}

	public static void Double_Click(WebElement element) {
		Actions acion = new Actions(driver);
		acion.doubleClick(element).build().perform();
	}

	public static void Move_To_Element(WebElement element) {

		Actions action = new Actions(driver);
		action.moveToElement(element).build().perform();
	}

	public static void Drag_and_Drop(WebElement source, WebElement target) {
		Actions action = new Actions(driver);
		action.dragAndDrop(source, target).build().perform();
	}

	public static void Click_and_Hold(WebElement element) {
		Actions action = new Actions(driver);
		action.clickAndHold(element).build().perform();
	}

	public static void Context_Click(WebElement element) {

		Actions action = new Actions(driver);
		action.contextClick(element).build().perform();
	}

	public static void Clickusing_Actions(WebElement element) {
		Actions action = new Actions(driver);
		action.click(element).build().perform();
	}

	public static void ElementInputValueUsingActions(WebElement element, String value) {
		Actions action = new Actions(driver);
		action.sendKeys(element, value);
	}

	public static void Switch_To_Frames(String option, Object value) {

		if (option.equalsIgnoreCase("index")) {
			driver.switchTo().frame(Integer.parseInt((String) value));
		} else if (option.equalsIgnoreCase("name")) {
			driver.switchTo().frame((String) value);
		} else if (option.equalsIgnoreCase("element")) {
			driver.switchTo().frame((WebElement) value);
		}

	}

	public static void Switch_Frame(String Option) {
		if (Option.equalsIgnoreCase("Parentframe")) {
			driver.switchTo().parentFrame();
		} else if (Option.equalsIgnoreCase("defaultframe")) {
			driver.switchTo().defaultContent();
		}
	}

	public static void Robot_Enter(String Functions) throws Exception {

		Robot r = new Robot();
		if (Functions.equalsIgnoreCase("Keypress")) {
			r.keyPress(KeyEvent.VK_ENTER);
		} else if (Functions.equalsIgnoreCase("keyrelese")) {
			r.keyRelease(KeyEvent.VK_ENTER);
		}
	}

	public static String Window_Handle() {
		String windowHandle = driver.getWindowHandle();
		return windowHandle;
	}

	public static Set<String> Window_Handles() {
		Set<String> windowHandles = driver.getWindowHandles();
		for (String window : windowHandles) {
			driver.switchTo().window(window).getTitle();
		}
		return windowHandles;
	}

	public static void DropDown_select(WebElement element, String option, String value) {
		Select s = new Select(element);
		if (option.equalsIgnoreCase("value")) {
			s.selectByValue(value);
		} else if (option.equalsIgnoreCase("Visibletext")) {
			s.selectByVisibleText(value);
		} else if (option.equalsIgnoreCase("index")) {
			s.selectByIndex(Integer.parseInt(value));
		}
	}

	public static void DropDown_deselect(WebElement element, String option, String value) {
		Select s = new Select(element);
		if (option.equalsIgnoreCase("value")) {
			s.deselectByValue(value);
		} else if (option.equalsIgnoreCase("Visibletext")) {
			s.deselectByVisibleText(value);
		} else if (option.equalsIgnoreCase("index")) {
			s.deselectByIndex(Integer.parseInt(value));
		}
	}

	public static boolean DropDown_IsMultiple(WebElement element) {
		Select s = new Select(element);
		boolean multiple = s.isMultiple();
		return multiple;
	}

	public static List<WebElement> DropDown_AllSelectedOptions(WebElement element) {
		Select sc = new Select(element);
		List<WebElement> allSelectedOptions = sc.getAllSelectedOptions();
		for (WebElement options : allSelectedOptions) {
			options.getText();
		}
		return allSelectedOptions;
	}

	public static void DropDown_FirstSelectedOption(WebElement element) {
		Select sc = new Select(element);
		WebElement firstSelectedOption = sc.getFirstSelectedOption();
		System.out.println(firstSelectedOption);
	}

	public static void Radio_Button(WebElement element) {
		element.click();
	}

	public static void Is_Enabled(WebElement element) {
		boolean enabled = element.isEnabled();
		System.out.println("is Enabled : " + enabled);
	}

	public static void Is_Displayed(WebElement element) {
		boolean displayed = element.isDisplayed();
		System.out.println("is Displayed : " + displayed);
	}

	public static void Is_Selected(WebElement element) {
		boolean selected = element.isSelected();
		System.out.println("is Selected : " + selected);
	}

	public static String Get_Title(WebDriver driver) {
		String title = driver.getTitle();
		return title;
	}

	public static String Get_Text(WebElement element) {
		String text = element.getText();
		return text;
	}

	public static String Get_Attribute(WebElement element) {
		String attribute = element.getAttribute("value");
		return attribute;
	}

	public static File Take_Screenshot(String path) throws IOException {
		File destination = new File(path);
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyDirectory(source, destination);
		return destination;
	}

	public static void Scroll_UsingCoordinates(int top, int height) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(" + top + "," + height + ")");
	}

	public static void Scroll_UsingElement(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", element);

	}

	public static String Read_Data(String path, String name, int row_index, int cell_index) throws IOException {

		File F = new File(path);
		FileInputStream fis = new FileInputStream(F);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sheet = wb.getSheet(name);
		Row row1 = sheet.getRow(row_index);
		Cell cell = row1.getCell(cell_index);
		CellType cellType = cell.getCellType();
		if (cellType.equals(CellType.STRING)) {
			value = cell.getStringCellValue();
		} else if (cellType.equals(CellType.NUMERIC)) {
			double numericValue = cell.getNumericCellValue();
			int intvalue = (int) numericValue;
			value = String.valueOf(intvalue);
		}
		wb.close();
		return value;

	}

}
