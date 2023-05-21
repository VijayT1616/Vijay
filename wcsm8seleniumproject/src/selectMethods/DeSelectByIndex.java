package selectMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeSelectByIndex 
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
		//to select multiple options
		    Select sel=new Select(dropDown);
		    for(int i=0;i<5;i++)
		    {
		    	if(i%2==0)
		    	{
		    		Thread.sleep(2000);
		    		sel.selectByIndex(i);
		    	}
		    	else
		    	{
		    		System.out.println("its odd place");
		    	}
		    	Thread.sleep(2000);
		    }
		    	for(int i=0;i<5;i++)
			    {
			    	if(i%2==0)
			    	{
			    		Thread.sleep(2000);
			    		sel.deselectByIndex(i);
			    	}
			    	else
			    	{
			    		System.out.println("its odd place");
			    	}
			    }  
       driver.close();
   }
}