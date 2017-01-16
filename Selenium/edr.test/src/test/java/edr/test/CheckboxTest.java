package edr.test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxTest {

	WebDriver driver;

	@Before
	public void setupTest() {
		System.setProperty("webdriver.chrome.driver", "/Users/cdanismaz/Documents/Library/testing/chromedriver");
		driver = new ChromeDriver();
		driver.get("http://www.spicejet.com");
	}

	@Test
	public void checkboxTest() {
		WebElement check = driver.findElement(By.cssSelector("#ctl00_mainContent_chk_IndArm"));
		check.click();

		Assert.assertTrue(check.isSelected());
	}

	@After
	public void afterTest() {
		driver.close();
	}

}
