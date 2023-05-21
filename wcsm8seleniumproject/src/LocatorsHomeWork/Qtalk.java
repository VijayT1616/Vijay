package LocatorsHomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Qtalk
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		
		driver.navigate().to("https://app.qtalk.com/account/login");
		Thread.sleep(10000);
		driver.findElement(By.tagName("input")).sendKeys("roshandevlekar@gmail.com");
		Thread.sleep(2000);
		driver.close();
	}

}
