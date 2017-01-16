package edr.test.helloworld;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class StaticDropDown {

	public static void main(String[] args) {
			// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/cdanismaz/Documents/Library/testing/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.spicejet.com");
		WebElement passcount = driver.findElement(By.cssSelector("#ctl00_mainContent_ddl_Adult"));
		Select passSelect = new Select(passcount);
		//passSelect.selectByIndex(2);
		//passSelect.selectByVisibleText("2 Adults");
		passSelect.selectByValue("7");
		
	}

}
