package test;


import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

 public class ChromeTest {
	WebDriver driver;

@Test
	
public void launchBrowser() throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver","/Users/gweng/Desktop/Development/drivers/chromedriver");
	driver = new ChromeDriver();
	driver.get("https://www.amazon.com/");	
	
	//Search Bar - type search criteria
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Military Tactical Flashlight Waterproof");
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.RETURN);
	
	//Pause
	Thread.sleep(3000);
	//Validate results returned	
	driver.findElement(By.xpath("//span[contains(text(),'Military Tactical Flashlight Waterproof')]"));
	
	//Close
	driver.close();
	
	}		
	
}