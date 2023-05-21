package selectMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import methodsofwebDriver.QuitMethod;

public class DeselectAll
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("file:///C:/Users/Santosh/Desktop/wcsm8%20HTML/MultiSelectDropdown.html");
		//To indentify dropDown
	    WebElement dropDown = driver.findElement(By.name("food menu"));
	    //To select multiple options
	    Select sel = new Select(dropDown);
	    for(int i=0;i<5;i++)
	    {
	    	Thread.sleep(2000);
	    	sel.selectByIndex(i);
	    }
	    Thread.sleep(2000);
	    sel.deselectAll();
	    driver.close();
	   
	}

}