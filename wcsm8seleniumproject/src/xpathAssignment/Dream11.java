package xpathAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Dream11
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");
		
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.dream11.com/login");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='regEmail']")).sendKeys("7057177027");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='GET APP LINK']")).click();
		
	}

}
