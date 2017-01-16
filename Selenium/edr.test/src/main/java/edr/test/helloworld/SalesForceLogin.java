package edr.test.helloworld;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SalesForceLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "/Users/cdanismaz/Documents/Library/testing/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		//driver.findElement(By.cssSelector(".input.r4.wide.mb16.mt8.username")).sendKeys("abc");
		//driver.findElement(By.cssSelector("[name='username']")).sendKeys("abc");
		driver.findElement(By.cssSelector("#login_form > label"));
	}
}
