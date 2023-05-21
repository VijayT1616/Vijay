package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFireFoxBrowser {
public static void main(String[] args) {
	//to launch Firefoxbrowser
	
	WebDriver driver=new FirefoxDriver ();
	driver.get("https://shoppersstack.com");
	driver.close();
	

}
}
