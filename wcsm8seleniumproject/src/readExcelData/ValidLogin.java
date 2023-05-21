package readExcelData;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ValidLogin {
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	ChromeOptions co = new ChromeOptions();
	co.addArguments("--remote-allow-origins=*");
	WebDriver driver=new ChromeDriver(co);
	driver.manage().window().maximize();
	
	
	driver.get("http://desktop-dkatet0/login.do");
	
	driver.findElement(By.name("username")).sendKeys("admin");
	driver.findElement(By.name("pwd")).sendKeys("manager");
	
	driver.findElement(By.id("loginButton")).click();
	
}
}
