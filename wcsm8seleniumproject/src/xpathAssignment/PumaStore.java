package xpathAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PumaStore //travers puma.com to menu
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		co.addArguments("--disable-notifications");
		
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://in.puma.com/in/en");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[text()='PUMA.com']/ancestor::a/following-sibling::button/descendant::span[text()='Menu']")).click();
		Thread.sleep(10000);
		driver.close();
		
	}

}
