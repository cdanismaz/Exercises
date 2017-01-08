package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/cdanismaz/Documents/Library/testing/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com.tr");
		WebElement searchBox = driver.findElement(By.id("lst-ib"));
		searchBox.sendKeys("MacBookAir");
		searchBox.sendKeys(Keys.RETURN);
		
	}

}
