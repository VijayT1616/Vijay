package takeScreenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

//To access the method we use ExplicitTypeCasting:way 5
public class GetScreenShot
{
	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//consider we are taking ss of selenium.dev webpage
		driver.get("https://www.selenium.dev/downloads/");
		TakesScreenshot ts=(TakesScreenshot) driver;
		
		//implementation of method
		File src = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("./ScreenShots/ss2.png");
		
		Files.copy(src, destination);
	}
}