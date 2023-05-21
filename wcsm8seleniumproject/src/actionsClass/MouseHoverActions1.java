package actionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverActions1
{
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://www.bluestone.com/");
	
	Thread.sleep(2000);
	driver.findElement(By.id("denyBtn")).click();
	
	Thread.sleep(2000);
	
	WebElement target = driver.findElement(By.xpath("//a[text()='Coins ']"));
	Actions act = new Actions(driver);
	act.moveToElement(target).perform();
	
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//span[@data-p='l-gold-coins-weight-1gms,m']")).click();
	
	Thread.sleep(2000);
	driver.close();
}
}