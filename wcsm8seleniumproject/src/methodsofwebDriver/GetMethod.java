package methodsofwebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GetMethod 
{

	public static void main(String[] args) throws InterruptedException
	{
		
	  System.setProperty("webdriver.chrome.driver","./drivers/Chromedriver.exe");

	  
	 ChromeOptions co = new ChromeOptions();
	 co.addArguments("--remote-allow-origins=*");
	 
	 WebDriver driver = new ChromeDriver(co);
	 driver.manage().window().maximize();
	 
	 
	 driver.get("http://omaya.blogspot.com/");
	 Thread.sleep(2000);
	
	 
	 
	  
	}
}
