package takeScreenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class GetSceenShot1
{
	public static void main(String[] args) throws IOException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		
		File src = driver.getScreenshotAs(OutputType.FILE);
		File destination = new File("./ScreenShot/ss5.jpg");
		
		Files.copy(src, destination);
	}
}