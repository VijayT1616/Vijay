package LocatorsHomeWork;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locatorsdemo {
	
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	driver.get("https://www.facebook.com/");
	
	            //Tag & Id 
	//  driver.findElement(By.cssSelector("input#email")).sendKeys("Vijay");
	  
	//driver.findElement(By.cssSelector("#email")).sendKeys("Vijju");

         // Tag & Class
	  
	 // driver.findElement(By.cssSelector("input.inputtext")).sendKeys("Vijay");
	  
	 // driver.findElement(By.cssSelector(".inputtext")).sendKeys("Vijju");
	  
	  //Tag & attribute
	
	//driver.findElement(By.cssSelector("input[data-testid=royal_email]")).sendKeys("Vijay");
	
	//driver.findElement(By.cssSelector("input[name=email]")).sendKeys("Vijay");
	  
	 //Tag ,Class & attribute
     driver.findElement(By.cssSelector("input.inputtext[data-testid=royal_email]")).sendKeys("Vijay");
     driver.findElement(By.cssSelector("input.inputtext[data-testid=royal_pass]")).sendKeys("Vijay");
     
     Thread.sleep(2000);
      
     driver.findElement(By.cssSelector("button[name=login]")).click();
 
     
}

}
