package edr.test.helloworld;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/cdanismaz/Documents/Library/testing/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.spicejet.com");
		WebElement leave = driver.findElement(By.cssSelector("#ctl00_mainContent_ddl_originStation1_CTXT"));
		leave.click();
		WebElement goa = driver.findElement(By.cssSelector("#dropdownGroup1 > div > ul:nth-child(2) > li:nth-child(4) > a"));
		goa.click();
		
//		List<WebElement> listItems = driver.findElements(By.cssSelector("#dropdownGroup1 > div > ul:nth-child(2) > li"));
//		for (int i = 0; i < listItems.size(); i++) {
//			WebElement item = listItems.get(i);
//			item.click();
//		}
		
		
	}

}
