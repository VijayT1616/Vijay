package actionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickMethod
{
public static void main(String[] args) throws InterruptedException {

System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

driver.get("https://www.selenium.dev/downloads/");
WebElement target = driver.findElement(By.linkText("4.9.0"));

Thread.sleep(2000);

//to perform mouse action we need to create object
Actions act = new Actions(driver);

//to use right click action
act.contextClick(target).perform();
Thread.sleep(5000);
driver.close();
}
}