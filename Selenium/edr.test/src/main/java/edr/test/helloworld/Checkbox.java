package edr.test.helloworld;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/cdanismaz/Documents/Library/testing/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.spicejet.com");
		WebElement check = driver.findElement(By.cssSelector("#ctl00_mainContent_chk_IndArm"));
		check.click();
		
		if (check.isSelected()){
			System.out.println("is checked");
		}
		else
			System.out.println("unchecked");
		
	}

}
