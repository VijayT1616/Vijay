package oprationalmethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IsMultiple
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Thread.sleep(2000);
		//for single select dropdown=false
		//driver.get("file:///C:/Users/shubham%20chavan/OneDrive/Desktop/wcsm8%20HTML/Dropdown1.htm");
		
		//multi select dropdown=true
		driver.get("file:///C:/Users/Santosh/Desktop/wcsm8%20HTML/MultiSelectDropdown.html");
		WebElement dropDown = driver.findElement(By.name("food menu"));
		Select sel = new Select(dropDown);
		boolean verify = sel.isMultiple();
		System.out.println(verify);
	}

}