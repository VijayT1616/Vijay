package xpathAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ActiTime
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("http://desktop-l22bg21/login.do");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='remember']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		Thread.sleep(5000);
		driver.close();
	}

}
