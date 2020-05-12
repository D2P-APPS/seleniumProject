package test;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

 public class LayoutFacetingExample {
	WebDriver driver;

@Test
	
public void layout() throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver","/Users/gweng/Desktop/Development/drivers/chromedriver");
	driver = new ChromeDriver();
	driver.get("http://localhost:4200/search");	
	//Maximize window
	driver.manage().window().maximize() ;
	
	Thread.sleep(2000);
	
	//Top Tool Bar of Page
	driver.findElement(By.xpath("//nav[@aria-label='Top toolbar']"));
	//Find Document Analytics Tool Image
	driver.findElement(By.xpath("//mat-icon[contains(text(),'fingerprint')]"));
	//Doc Search
	driver.findElement(By.xpath("//span[text()='Document Search']"));
	//Doc Analytics
	driver.findElement(By.xpath("//span[text()='Document Analytics']"));
	
	//Search container
	driver.findElement(By.xpath("//div[@class='search-container']"));
	//Title	
	driver.findElement(By.xpath("//h1[text()='Document Search']"));
	//Search Bar
	driver.findElement(By.xpath("//input[@aria-label='Search']"));
	
	//Left Frame of Page
	//Genre of Docs
	driver.findElement(By.xpath("//div[@class='mat-subheader'][text()='Genre']"));	
	//Book Genre check box and number of Docs
	driver.findElement(By.xpath("//span[text()=' Non-fiction (5) ']"));
	//Book Genre check box and number of Docs
	driver.findElement(By.xpath("//span[text()=' Fiction (2) ']"));
	//Book Genre check box and number of Docs
	driver.findElement(By.xpath("//span[text()=' Comedy (1) ']"));
	//Book Genre check box and number of Docs
	driver.findElement(By.xpath("//span[text()=' Action (3) ']"));
	//Book Genre check box and number of Docs
	driver.findElement(By.xpath("//span[text()=' Mystery(1) ']"));
	
	//Author of Docs
	driver.findElement(By.xpath("//div[@class='mat-subheader'][text()='Author']"));
	//Author check box
	driver.findElement(By.xpath("//span[text()=' George R.r. Martin (2) ']"));
	//Author check box
	driver.findElement(By.xpath("//span[text()=' Lloyd Alexander (8) ']"));
	
	//Middle Frame of Page
	//List of Results
	driver.findElement(By.xpath("//div[@class='col results']"));
	//Book #1 result
	//Doc Title
	driver.findElement(By.xpath("//h3[text()=' BOOK #1 ']"));
	//Author:
	driver.findElement(By.xpath("//div[@class='result-info-section'][text()='Author: ']"));
	//Genre:
	driver.findElement(By.xpath("//div[@class='result-info-section'][text()='Genre: ']"));
	//Matches Button
	driver.findElement(By.xpath("//button[@mattooltip='Show/hide matches'][@ng-reflect-disabled='false']"));
	//Match Badge
	driver.findElement(By.id("mat-badge-content-0"));
	
	//Right Frame of Page
	//Document View
	//Doc Title
	driver.findElement(By.xpath("//div[@class='doc-title']"));
	//Show OCR Text Toogle
	driver.findElement(By.xpath("//div[@class='mat-slide-toggle-bar']/input[@aria-checked='false']"));
	
	//Tool Bar Left
	//Outline View Icon
	driver.findElement(By.xpath("//button[@aria-label='Toggle outline'][@ng-reflect-message='Open outline']"));
	//Page Navigation
	driver.findElement(By.xpath("//div[@class='page-nav']"));
	
	//Tool Bar Right
	//Search Icon
	driver.findElement(By.xpath("//mat-icon[text()='search']"));
	//Rotate Icon
	driver.findElement(By.xpath("//mat-icon[text()='rotate_right']"));
	//Zoom In Icon
	driver.findElement(By.xpath("//mat-icon[text()='zoom_in']"));
	//Zoom Out Icon
	driver.findElement(By.xpath("//mat-icon[text()='zoom_out']"));
	//Edit Icon
	driver.findElement(By.xpath("//mat-icon[text()='edit']"));
	//More Option Icon
	driver.findElement(By.xpath("//mat-icon[text()='more_vert']"));
	
	//Document Page View
	driver.findElement(By.id("page1"));
	
	//Bottom of Doc
	//Previous Page disabled
	driver.findElement(By.xpath("//button[@class='mat-focus-indicator mat-flat-button mat-button-base mat-primary'][@disabled='true']"));
	//Next Page enabled
	driver.findElement(By.xpath("//button[@class='mat-focus-indicator mat-flat-button mat-button-base mat-primary'][@ng-reflect-disabled='false']"));
	
	//Close
	driver.close();
	
	}		
	
}