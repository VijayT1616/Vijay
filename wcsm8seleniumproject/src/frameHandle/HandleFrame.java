package frameHandle;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFrame {
	 public static void main(String[] args) throws InterruptedException {
			
		  System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

			//	Open Browser
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			//Enter url of (ActiTime)
			driver.get("file:///C:/Users/Santosh/Desktop/wcsm8%20HTML/Frame.html");
			
			driver.findElement(By.name("n1")).sendKeys("admin");
			
			driver.switchTo().frame(0);
		
			driver.findElement(By.name("n1")).sendKeys("manager");
		// driver.switchTo().parentFrame();
	 }	    

}
