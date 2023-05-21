package xpathAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Hotstar
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hotstar.com/in/subscribe/sign-in");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='phoneNo']")).sendKeys("7057177027");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Continue']")).click();
		Thread.sleep(2000);
		driver.close();
		
	}

}
