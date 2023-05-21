package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollLeft_Right {
	
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	
	driver.get("https://dashboards.handmadeinteractive.com/jasonlove/");
	
	//Scrolling Opration
	
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	
	// Scroll left
	Thread.sleep(2000);
	
	jse.executeScript("window.scrollBy(-500,0)");
	
	// Scroll Right
      Thread.sleep(2000);
	jse.executeScript("window.scrollBy(500,0)");
	
}
	
	
}
