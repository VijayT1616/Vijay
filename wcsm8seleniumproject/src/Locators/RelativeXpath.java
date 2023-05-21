package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RelativeXpath	//by using starting attribute value
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com/accounts/login/");
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys("roshan77");
		driver.findElement(By.name("password")).sendKeys("ihiuhho");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='_acan _acap _acas _aj1-']")).click();
		Thread.sleep(2000);
		driver.close();
	}
}
