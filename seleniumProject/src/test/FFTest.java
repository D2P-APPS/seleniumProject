package test;


import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


 public class FFTest {
	WebDriver driver;

@Test
	
public void launchBrowser() {
	
	System.setProperty("webdriver.gecko.driver","/Users/gweng/Desktop/Development/drivers/geckodriver");
	driver = new FirefoxDriver();
	driver.get("https://www.amazon.com/");
	driver.close();
	
	}		
	
}