package LocatorsHomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Jio
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.jio.com/selfcare/login/");
		Thread.sleep(2000);
		driver.findElement(By.tagName("input")).sendKeys("jio fibre plan");
		Thread.sleep(2000);
		driver.close();
	}

}
