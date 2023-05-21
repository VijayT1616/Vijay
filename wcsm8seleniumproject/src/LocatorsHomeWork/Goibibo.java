package LocatorsHomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Goibibo	//by using Absolute Xpath
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		
		driver.get("https://www.goibibo.com/users/login/");
		Thread.sleep(2000);
		driver.findElement(By.name("phone")).sendKeys("9511816257");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[1]/div/div/div[2]/div/div/form/button")).click();
		Thread.sleep(3000);
		driver.close();
	}
}
