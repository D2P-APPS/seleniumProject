package test;

import java.util.concurrent.TimeUnit;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

 public class NavigateFacetingExample {
	WebDriver driver;

@Test
	
public void navigate() throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver","/Users/gweng/Desktop/Development/drivers/chromedriver");
	driver = new ChromeDriver();
	driver.get("http://localhost:4200/search");	
	//Maximize window
	driver.manage().window().maximize() ;
	
	Thread.sleep(2000);
	
	//Scenario 1
	//Click on Matches Button
	driver.findElement(By.xpath("//button[@mattooltip='Show/hide matches'][@ng-reflect-disabled='false']")).click();
	//Wait
	driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	
	//Click on Matrix Button
	driver.findElement(By.xpath("//a[@class='mat-focus-indicator mat-stroked-button mat-button-base']")).click();
	//Wait
	driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	
	//Document Search / Match Matrix Title
	driver.findElement(By.xpath("//a[text()='Document Search']"));	
	driver.findElement(By.xpath("//h1[text()='Document Match Matrix']"));
	//PDF Viewer left 
	driver.findElement(By.xpath("//div[@class='viewer-container']"));
	//Row PDF Viewer right
	driver.findElement(By.xpath("//div[@class='row viewer-container-right']"));
	
	//Click on BOOK #1 - COPY 2 Compare Source Icon
	driver.findElement(By.xpath("(//a[@class='mat-focus-indicator fixed-top-right mat-mini-fab mat-button-base mat-accent'])[2]")).click();
	//BOOK #2 Display PDF View
	driver.findElement(By.xpath("//h2[text()=' BOOK #1 - COPY #2 ']"));
	//Document Search Link / Document Match Compare Title
	driver.findElement(By.xpath("//a[text()='Document Search']"));	
	driver.findElement(By.xpath("//h1[text()='Document Match Compare']"));
	//Show/hide all matches Icon
	driver.findElement(By.xpath("//button[@class='mat-focus-indicator mat-mini-fab mat-button-base mat-accent fixed-bottom-right-off']"));
	
	//Click on Show/hide all matches Icon 
	driver.findElement(By.xpath("//button[@class='mat-focus-indicator mat-mini-fab mat-button-base mat-accent fixed-bottom-right-off']")).click();	
	//Wait
	driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	
	//Click on Document Search Link
	driver.findElement(By.xpath("//a[text()='Document Search']")).click();	
	//Wait
	driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	
	//Scenario 2
	//Click on Matches Button
	driver.findElement(By.xpath("//button[@mattooltip='Show/hide matches'][@ng-reflect-disabled='false']")).click();
	//Wait
	driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	
	//Click on BOOK #1 - COPY 2 Compare Source Icon
	driver.findElement(By.xpath("(//a[@class='mat-focus-indicator mat-icon-button mat-button-base mat-accent'])[2]")).click();
	//Wait
	driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	
	//BOOK #1 Display PDF View Left
	driver.findElement(By.xpath("//h2[text()=' BOOK #1']"));	
	//BOOK #2 Display PDF View Right
	driver.findElement(By.xpath("//h2[text()=' BOOK #1 - COPY #2 ']"));
	//Document Search Link / Document Match Compare Title
	driver.findElement(By.xpath("//a[text()='Document Search']"));
	driver.findElement(By.xpath("//h1[text()='Document Match Compare']"));
	
	//Click on Document Search Link
	driver.findElement(By.xpath("//a[text()='Document Search']")).click();	
	//Wait
	driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	
	
	//Scenario 2	
	//Mystery Gene check box
	driver.findElement(By.xpath("//span[text()=' Mystery(1) ']")).click();

	//Validate results 
	//Doc Title
	driver.findElement(By.xpath("//h3[text()=' BOOK #4 ']"));
	//Author:
	driver.findElement(By.xpath("//div[text()='Author: ']/span[text()='George R.R. Martin']"));
	//Genre:
	driver.findElement(By.xpath("//div[text()='Genre: ']/span[text()='Mystery']"));
	//Matches Button
	driver.findElement(By.xpath("//button[@mattooltip='Show/hide matches'][@ng-reflect-disabled='true']"));

	//Doc Title
	driver.findElement(By.xpath("//h3[text()=' BOOK #4 ']")).click();
	//Wait
	driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	
	//Document View Right 
	//Doc Title
	driver.findElement(By.xpath("//h2[text()='BOOK #4']"));
	
	//Mystery Gene check box
	driver.findElement(By.xpath("//span[text()=' Mystery(1) ']")).click();
	//BOOK #1 Displays
	driver.findElement(By.xpath("//h3[text()=' BOOK #1 ']"));
	
	Thread.sleep(2000);
	
	//Close
	driver.close();
	
	}		
	
}