package oprationalmethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetFirstSelectedOptions
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//for multi select dropdown
		driver.get("file:///C:/Users/Santosh/Desktop/wcsm8%20HTML/MultiSelectDropdown.html");
		WebElement dropDown = driver.findElement(By.name("food menu"));
		Select sel = new Select(dropDown);
		for(int i=3;i<5;i++)
		{
			Thread.sleep(2000);
			sel.selectByIndex(i);
		}
		Thread.sleep(2000);
		WebElement firstOptions = sel.getFirstSelectedOption();
		String value = firstOptions.getText();
		System.out.println(value);
		
	}

}