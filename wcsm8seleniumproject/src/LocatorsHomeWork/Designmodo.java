package LocatorsHomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Designmodo
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		
		driver.navigate().to("https://designmodo.com/my-account/sign-in/");
		
		
		driver.findElement(By.tagName("input")).sendKeys("roshandevlekar87@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("[name=password]")).sendKeys("rosha");
		
		driver.close();
		
	}

}
