package selectMethods;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetAllSelectedOptionsMethod {
	
	// get the all selected option from dropDown....
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("file:///C:/Users/Santosh/Desktop/wcsm8%20HTML/MultiSelectDropdown.html");
		
		WebElement dropDown = driver.findElement(By.name("food menu"));
		
		Select sel = new Select(dropDown);
		
		//how to select multiple options
		for(int i=0;i<5;i++)
		{
			
			sel.selectByIndex(i);
		}

		
		List<WebElement> allOptions = sel.getAllSelectedOptions();
		for(WebElement op:allOptions)
		{
			String options = op.getText();
			System.out.println(options);
			
		}

	}

}
