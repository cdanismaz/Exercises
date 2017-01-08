package firstselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelloWorld {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "/Users/cdanismaz/Documents/Library/testing/geckodriver");
		System.setProperty("webdriver.chrome.driver", "/Users/cdanismaz/Documents/Library/testing/chromedriver");
		WebDriver webDriver = new ChromeDriver();
		webDriver.get("http://www.facebook.com");
		String title = webDriver.getTitle();
		System.out.println(title);
		//System.out.println(webDriver.getPageSource());
		System.out.println(webDriver.getCurrentUrl());
		webDriver.close();
	}

}
