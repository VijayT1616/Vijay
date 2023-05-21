package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AbsoluteXpath	//by using starting attribute value
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
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/div/div/div/div[1]/section/main/div/div/div[1]/div[2]/form/div/div[3]/button")).click();
		Thread.sleep(2000);
		driver.close();
	}
}
