package qsp;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class LaunchEdgeBrowser 
{

	public static void main(String[] args) throws InterruptedException
	{
		// TO avoid IllegalStateException
		System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");
		
		//to avoid ConnetionFailedException
		EdgeOptions eo=new EdgeOptions();
		eo.addArguments("--remote-allow-origins=*");
		
		//to launchEdgeBrowser
		EdgeDriver driver=new EdgeDriver(eo);  //driver(object) is a one of the variable in the code
		driver.manage().window().maximize(); //to maximize the window
		Thread.sleep(5000); //stop the execution of script for 10 sec
		
		//to close the edge browser
		driver.close();

	}

}

