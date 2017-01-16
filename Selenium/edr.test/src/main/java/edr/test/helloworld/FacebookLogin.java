package edr.test.helloworld;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/cdanismaz/Documents/Library/testing/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		WebElement emailinput = driver.findElement(By.id("email"));
		WebElement passwordinput = driver.findElement(By.id("pass"));
		WebElement loginbutton = driver.findElement(By.id("u_0_l"));
		//driver.findElement(By.linkText("Forgotten account?")).click();
		emailinput.sendKeys("danismaz.furkan@gmail.com");
		passwordinput.sendKeys("8589cfdt");
		loginbutton.click();
	}

}
