package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LaunchChromBrowser {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		// to avoid IllealeStateException
	//	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		
		// to avoid ConnectionFailedException
	 //    ChromeOptions co=new ChromeOptions();
	     
	   //    co.addArguments("--remote-allow-origins=*");
	      
        
		// to launch chrome browser
	       WebDriver driver =new ChromeDriver();
	       
	    // to maximize browser
	       driver.manage().window().maximize();
	       
	       // to close the chrome Browser
	      Thread.sleep(4000); // to stope execution script  of 4 sec
	      
	     
	       
	       // To close the cromebrowser
	      driver.close();
		

			
	}

}
