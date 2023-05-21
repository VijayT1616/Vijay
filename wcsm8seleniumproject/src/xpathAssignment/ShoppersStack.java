package xpathAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ShoppersStack
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		//co.addArguments("--disable-notifications");
		
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://www.shoppersstack.com/user-signin");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("shubhamchavan11698@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='Password']")).sendKeys("Password@123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Login']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[text()='Men']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='men jeans']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Skinny Men Blue Jeans']")).click();
		Thread.sleep(2000);
		driver.close();

	}

}
