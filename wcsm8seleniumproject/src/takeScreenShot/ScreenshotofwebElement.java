package takeScreenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScreenshotofwebElement 
{

	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.instagram.com/");
		
	    WebElement button = driver.findElement(By.xpath("//button[@class='_acan _acap _acas _aj1-']"));
	    
	    if(button.isEnabled())
	    {
	    	System.out.println("we can do the login");
	    }

	    else
	    {
	    	System.out.println("we can do not login");
	    	File src =button.getScreenshotAs(OutputType.FILE);
	    	File destination = new File("./ScreenShot/ss6.png");
			
			Files.copy(src, destination);
		}
	    }
}