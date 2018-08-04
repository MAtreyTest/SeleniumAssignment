package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class assignmentGoogleAdvancePageHashtagcomparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver", "../BasicSelenium1/src/Resources/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/advanced_search");
		
		driver.findElement(By.xpath("//input[@id='xX4UFf']")).sendKeys("tri-colour");
		driver.findElement(By.xpath("//input[@id='CwYCWc']")).sendKeys("rat terrier");
		driver.findElement(By.xpath("//input[@id='mSoczb']")).sendKeys("standard");
		driver.findElement(By.xpath("//input[@id='t2dX1c']")).sendKeys("-rodent");
		driver.findElement(By.xpath("//input[@id='LK5akc']")).sendKeys("1");
		driver.findElement(By.xpath("//input[@name='as_nhi']")).sendKeys("200000");
		driver.findElement(By.xpath("//div[@id='lr_button']")).click();
		driver.findElement(By.xpath("//li[@id=':2']")).click();
		
	    driver.findElement(By.xpath("//div[@id='cr_button']")).click();
	    driver.findElement(By.xpath("//li[@id=':1c']")).click();
		
	    driver.findElement(By.xpath("//div[@id='as_qdr_button']")).click();
	    driver.findElement(By.xpath("//li[@id=':80']")).click();
	    
	    driver.findElement(By.xpath("//input[@id='NqEkZd']")).sendKeys("abc.org");
	    
	    driver.findElement(By.xpath("//div[@id='as_occt_button']")).click();
	    driver.findElement(By.xpath("//li[@id=':87']")).click();
	    
	    driver.findElement(By.xpath("//div[@id='as_filetype_button']")).click();
	    driver.findElement(By.xpath("//li[@id=':8j']")).click();
	    
	    driver.findElement(By.xpath("//div[@id='as_rights_button']")).click();
	    driver.findElement(By.xpath("//li[@id=':8e']")).click();
	    
	    driver.findElement(By.xpath("//input[@class='jfk-button jfk-button-action dUBGpe']")).submit();
		
		 
		//driver.findElement(By.xpath("//div[@class='goog-select gGbPid goog-inline-block goog-flat-menu-button\']")).sendKeys("Arabic");
		
	}

}
