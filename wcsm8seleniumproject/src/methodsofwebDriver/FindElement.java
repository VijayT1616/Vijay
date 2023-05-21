package methodsofwebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FindElement
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		
		driver.get("http://desktop-dkatet0/login.do");
		WebElement usernameTextBox=driver.findElement(By.name("username"));	//if we provide wrong Attribute value then it is fetch 
																			//Exception like NoSuchElementException on the console
		usernameTextBox.sendKeys("admin");
		System.out.println(usernameTextBox);	//we will get address as webElement as a Output
	}

}
