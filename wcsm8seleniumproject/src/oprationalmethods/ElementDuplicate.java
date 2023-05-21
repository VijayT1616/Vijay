package oprationalmethods;

import java.time.Duration;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ElementDuplicate
{
	//To eleminate duplicate from dropdown by using treeset
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		//for multi select dropdown
		driver.get("file:///C:/Users/Santosh/Desktop/wcsm8%20HTML/SingalSelectDropdown1.htm");
		WebElement dropDown = driver.findElement(By.name("menu"));
		
		//to handle dropdown obj of select class
		Select sel=new Select(dropDown);
		
		//to get all the options from download
		List<WebElement> allOptions = sel.getOptions();
		
		//to eliminate the duplicates & maintain the order of insertion we use treeset
		TreeSet<String> ts = new TreeSet<String>();
		
		//to read the list by eliminating duplicates
		for(int i=0;i<allOptions.size();i++)
		{
			//get the options & text of options
			String op = allOptions.get(i).getText();
			
			//add the text of options to treeset
			ts.add(op);
		}
		//to read the options from set
		for(String options:ts)
		{
			Thread.sleep(2000);
			System.out.println(options);
		}

	}

}