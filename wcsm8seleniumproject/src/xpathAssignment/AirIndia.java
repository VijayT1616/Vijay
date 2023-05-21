package xpathAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class AirIndia
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.airindia.in/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("Pune");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='Pune, Lohegaon Airport, PNQ, India, IN']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='to']")).sendKeys("mum");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='Mumbai, Chhatrapati Shivaji International Airport, BOM, India, IN']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='_depdateeu1']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[contains(@class,'ui-state-default') and text()='13']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='_retdateeu1']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[contains(@class,'ui-state-default') and text()='27']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='btnbooking']")).click();
		Thread.sleep(5000);
		driver.close();
	}

}
