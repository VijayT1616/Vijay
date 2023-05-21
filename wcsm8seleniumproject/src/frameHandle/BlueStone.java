package frameHandle;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
 

   public class BlueStone {
      public static void main(String[] args) throws InterruptedException {
	
	  System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		//	Open Browser
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Enter url of (ActiTime)
		driver.get("https://www.bluestone.com/");
		
		driver.findElement(By.id("denyBtn")).click();
		
		Thread.sleep(2000);
		
	    WebElement frameElement = driver.findElement(By.xpath("//iframe[@name='fc_widget']"));
	    
	   // Switch to controll to frame or click on chat box>>>>>>>>>
		driver.switchTo().frame("fc_widget"); // By using name or id
		
		//driver.switchTo().frame("frameElement");
		
	    WebElement chatBox = driver.findElement(By.id("chat-icon"));
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(chatBox)).click();
		
    	driver.switchTo().defaultContent(); // Switch the controll to default webpage
    	
	      // insert the for textbox
		driver.findElement(By.id("chat-fc-name")).sendKeys("Vijay_123");
		driver.findElement(By.id("chat-fc-email")).sendKeys("Vijay@123");
		driver.findElement(By.id("chat-fc-phone")).sendKeys("2544587123");
		
	  
}
}
