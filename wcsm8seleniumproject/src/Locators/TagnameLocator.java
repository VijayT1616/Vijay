package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByTagName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TagnameLocator
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/shubham%20chavan/OneDrive/Desktop/wcsm8%20HTML/usearnameTextField.html");
		
		Thread.sleep(2000);
		driver.findElement(By.tagName("input")).sendKeys("admin");
		
		driver.navigate().to("https://www.instagram.com/");
		Thread.sleep(2000);
		driver.findElement(By.tagName("input")).sendKeys("___roshan77");
		Thread.sleep(2000);
		driver.close();
		//driver.findElement(By.tagName("input")).sendKeys("&manager");
	}

}
