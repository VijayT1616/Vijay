package methodsofwebDriver;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FindElements
{
	public static void main(String[] args)  throws InterruptedException		// to find multiple webElement on webpage
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		
		driver.switchTo().activeElement().sendKeys("poha");
		Thread.sleep(2000);
		List<WebElement> pohaOptions = driver.findElements(By.xpath("//div[@class='eIPGRd']"));
		
		//for(int i=0;i<=pohaOptions.size();i++)
		//{
		//	String poha=pohaOptions.get(i).getText();
		//	System.out.println(poha);
		//	Thread.sleep(2000);
		//}
	//	driver.close();
		for(WebElement poha:pohaOptions)
		{
			String allOps=poha.getText();
			System.out.println(allOps);
			Thread.sleep(2000);
		}
	}

}
