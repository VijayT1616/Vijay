package oprationalmethods;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetOptions
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//for single select dropdown
		//driver.get("file:///C:/Users/shubham%20chavan/OneDrive/Desktop/wcsm8%20HTML/Dropdown1.htm");
		
		//for multi select dropdown
		driver.get("file:///C:/Users/Santosh/Desktop/wcsm8%20HTML/MultiSelectDropdown.html");
		WebElement dropDown = driver.findElement(By.name("food menu"));
		Select sel=new Select(dropDown);
		List<WebElement> allOptions = sel.getOptions();
		
		for(int i=0;i<allOptions.size();i++)
		{
			String option = allOptions.get(i).getText();
			System.out.println(option);
		}
	}

}