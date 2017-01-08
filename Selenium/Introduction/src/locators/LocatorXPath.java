package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocatorXPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "/Users/cdanismaz/Documents/Library/testing/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://qaclickacademy.com");
		WebElement submitButton = driver.findElement(By.xpath(".//*[@id='homepage']/section[2]/div/a"));
		submitButton.click();
		
		
		driver.close();
		
	}

}
