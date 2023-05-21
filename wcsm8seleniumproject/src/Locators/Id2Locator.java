package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Id2Locator
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.netflix.com/in/Login");
		Thread.sleep(2000);
		driver.findElement(By.id("id_userLoginId")).sendKeys("7057177027");
		driver.findElement(By.id("id_password")).sendKeys("Roshan@77");
		driver.findElement(By.xpath("//button[text()='Sign In']")).click();
		Thread.sleep(20000);
		driver.close();
	}

}
