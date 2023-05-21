package LocatorsHomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Zee5Absolute	//by using absolute x path
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		ChromeOptions co=new ChromeOptions();		
		co.addArguments("--remote-allow-origins=*");
		
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		
		driver.get("https://www.goibibo.com/users/login/");
		
		driver.findElement(By.name("phone")).sendKeys("1236547896");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/div[2]/div[6]/div[1]/div/button")).click();
		Thread.sleep(12000);
	
	}
}