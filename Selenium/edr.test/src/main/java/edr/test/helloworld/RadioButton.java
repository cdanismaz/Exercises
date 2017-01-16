package edr.test.helloworld;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/cdanismaz/Documents/Library/testing/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.spicejet.com");
		//WebElement radio = driver.findElement(By.cssSelector("#ctl00_mainContent_rbtnl_Trip_1"));
		//radio.click();
//		if (radio.isSelected()){
//			System.out.println("checked");
//		}
//		else
//			System.out.println("unchecked");
		List<WebElement> radioButtons = driver.findElements(By.cssSelector("input[name='ctl00$mainContent$rbtnl_Trip"));
		WebElement first = radioButtons.get(1);
		first.click();
	
	}

}
